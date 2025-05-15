import { useState } from 'react'
import {Routes,Route} from 'react-router-dom'

import Login from "./pages/Login/Login.tsx";
import Signup from "./pages/Login/Signup.tsx";
import Home from "./pages/Home.tsx";
import Navbar from "./pages/common/Navbar.tsx";



  function App() {

    return (
      <>
      <Navbar/>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/login" element={<Login />} />
          <Route path="/signup" element={<Signup />} />
        </Routes>
      </>
    )
  }

export default App
