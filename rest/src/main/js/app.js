const React = require('react');
const ReactDOM = require('react-dom');
const ReactBoot = require('react-bootstrap');
const client = require('restangular');

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {clients: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/clients'}.done(response => {
            this.setState({clients: response.entity._embedded.clients});
        }))
    }

    render() {
        return (
            < ClientList
        clients = {this.state.clients}
        />
    )
    }
}

class ClientList extends React.Component {
    render() {
        const clients = this.props.clients.map(client =>
            <Client
        key = {client._links.self.href}
        client = {client}
        />
    );
        return(
            <table>
                <tbody>
                <tr>
                    <th>Email</th>
                    <th>Discount</th>
                    <th>Password</th>
                    <th>Role</th>
                </tr>
                {clients}
                </tbody>
            </table>
        )
    }
}

class Client extends React.Component {
    render() {
        return (
            <tr>
                <td>{this.props.client.email}</td>
                <td>{this.props.client.discount}</td>
                <td>{this.props.client.password}</td>
                <td>{this.props.client.role}</td>
            </tr>
        );
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)