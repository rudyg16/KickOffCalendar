'use client';  // Important for Next.js to mark this as a client component

import React, { useState } from 'react';
import { IoMdSearch } from "react-icons/io";

const SearchBar: React.FC = () => {
    const [searchTerm, setSearchTerm] = useState("");

    return (
        <div className="input-wrapper space-x-1 flex items-center w-full px-3 py-2 bg-[var(--color-secondary)] text-[var(--color-text)] border border-[var(--color-border)] rounded-md focus:outline-none focus:ring-2 focus:ring-[var(--color-primary)]">
            <IoMdSearch size={30} />
            <input
                type="text"
                placeholder="Search..."
                className="bg-transparent border-none outline-none flex-1"
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
            />
        </div>
    );
};

export default SearchBar;
