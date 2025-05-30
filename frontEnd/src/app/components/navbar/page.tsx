'use client';

import { useState, type FC } from 'react';
import SearchBar from '../searchbar/page';

import Link from 'next/link';
import { GiSoccerBall } from "react-icons/gi";
import { IoMdSettings } from "react-icons/io";
import { CgProfile } from "react-icons/cg";

type NavLink = {
    id: number;
    href: string;
    label: string;
};

const Navbar: FC = () => {
    const navlinks: NavLink[] = [
        { id: 1, href: "/", label: "Home" },
        { id: 2, href: "/settings", label: "Settings" },
        { id: 3, href: "/login", label: "Login" },
        { id: 4, href: "/favorites", label: "Favorites" },
        { id: 5, href: "/", label: "Favorites" }
    ];

    return (
        <nav className="w-full bg-[var(--color-secondary)] text-[var(--color-text)] px-2 py-4">
            {/* Top Row */}
            <div className="flex items-center justify-between mb-2">
                <Link href="/" className="flex items-center space-x-2 transition-all hover:scale-105">
                    <GiSoccerBall size={32} />
                    <span className="font-gilroy font-bold text-2xl">KickOff</span>
                </Link>

                <div>
                    <SearchBar />
                </div>

                <div className="flex items-center space-x-5 mr-5 text-[var(--color-text)]">
                    <Link href="/settings" className="hover:scale-105 transition-all"> <IoMdSettings size={30} /></Link>
                    <Link href="/profile" className="hover:scale-105 transition-all"> <CgProfile size={30} /></Link>
                </div>
            </div>

            {/* Bottom Row */}
            <div className="flex space-x-4 mt-2">
                {navlinks.map((link) => (
                    <Link key={link.id} href={link.href} className="hover:underline">
                        {link.label}
                    </Link>
                ))}
            </div>
            
        </nav>
    );
};

export default Navbar;
