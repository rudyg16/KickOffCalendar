import { useState, type FC } from 'react';
import ball from '../../assets/navassets/ball.svg';
import type {NavLink} from "./types/NavLink";
import {Link} from 'react-router-dom'

const Navbar: FC = () => {


    const navlinks:NavLink[] =[
      {id:1, href:"",label:"Home"},  
      {id: 2, href: "", label: "Settings" },  
      {id: 3, href: "", label: "Login" }, 
      {id: 4, href: "./pages/", label: "Favorites" },
      {id:5, href:"./pages/Home",label:"Home"},     
    ];
    return (
        <nav className="w-full bg-[var(--color-secondary)] text-[var(--color-text)] px-2 py-4">
            {/*Top Row */}
            <div className="flex items-center justify-between mb-2 ">
                <Link to="/" className="flex items-center space-x-2 transition-all hover:scale-105">
                        <img src={ball} alt='ball logo' className="h-8 w-8 " />
                        <span className=" font-gilroy font-bold text-2xl ">KickOff</span>    
                </Link>
            </div>
            {/*Bottom Row*/}
            <div>

            </div>
        </nav>
    );
};

export default Navbar;
