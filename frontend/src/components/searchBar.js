import React from 'react'

const searchBar = () => {
    return (
        <div className="search-bar">
            <form action="/" method="post">
                <input
                    type="text"
                    id="header-search"
                    placeholder="Town name"
                    name="s" 
                />
            <button type="submit">Search</button>
            </form>
        </div>
    )
}

export default searchBar
