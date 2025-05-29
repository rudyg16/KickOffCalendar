import React from 'react'
import {useState} from 'react'
import { IoMdSearch } from "react-icons/io";



const SearchBar = () => {
  const [searchTerm, setSearchTerm] = useState("");//If user types icon will dissapear
  return (
    <div className="input-wrapper space-x-1 flex items-center w-full px-3 py-2 bg-[var(--color-secondary)] text-[var(--color-text)] border border-[var(--color-border)] rounded-md focus:outline-none focus:ring-2 focus:ring-[var(--color-primary)]">
      <IoMdSearch size={30}/>
      <input
        type="text"
        placeholder="Search..."
        className="bg-transparent border-none outline-none"
      />
    </div>
  )
}

export default SearchBar
