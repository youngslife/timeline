import React, {Component} from 'react';
import {history} from './History';
import {Router, Route, Switch} from "react-router-dom"

import Login from './components/Login';
import Register from './components/Register';
import Timeline from './components/Timeline';

import './App.css';


class App extends Component {
    render() {
        return (
            < div >
            < Router
        history = {history} >
            < Switch >
            {/* exact는 주어진 경로와 정확히 맞아 떨어져야만 설정한 컴포넌트를 보여줌 */}
            < Route
        path = '/login'
        exact
        component = {Login}
        />
        < Route
        path = '/register'
        exact
        component = {Register}
        />
        < Route
        path = '/timeline'
        exact
        component = {Timeline}
        />
        < /Switch>
        < /Router>
        < /div>
    )
    }
}

export default App;
