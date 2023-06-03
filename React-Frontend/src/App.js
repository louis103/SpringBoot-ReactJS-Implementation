/* eslint-disable no-unused-vars */
import './App.css';
import {BrowserRouter as Router, Routes, Route, Link, NavLink, useNavigate} from 'react-router-dom';
import UserComponent from './components/UserComponent';


function App() {
  return (
    <div className="App">
      <UserComponent />
    </div>
  );
}

export default App;
