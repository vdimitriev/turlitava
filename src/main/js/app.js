const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component { (1)

	constructor(props) {
		super(props);
		this.state = {journeys: []};
	}

	componentDidMount() { (2)
		client({method: 'GET', path: '/api/journeys'}).done(response => {
			this.setState({journeys: response.entity._embedded.journeys});
		});
	}

	render() { (3)
		return (
			<JourneyList journeys={this.state.journeys}/>
		)
	}
}

class JourneyList extends React.Component{
	render() {
		const journeys = this.props.journeys.map(journey =>
			<Journey key={journey._links.self.href} journey={journey}/>
			<Journey key={journey._links.self.href} data={journey}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Name</th>
						<th>Carrier</th>
						<th>Line number</th>
					</tr>
					{journeys}
				</tbody>
			</table>
		)
	}
}

class Journey extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.journey.name}</td>
				<td>{this.props.journey.carrierName}</td>
				<td>{this.props.journey.lineNumber}</td>
			</tr>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)