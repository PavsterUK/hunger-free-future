import React, { useState, useEffect } from 'react'

const foodBankListing = (props) => {
    return (
        <div className="foodbank-listing">
            <li>
                <h1>{props.name}</h1>    
                <h2>{props.address}</h2>
                <ul>
                    <li>
                        {props.needs}
                    </li>
                </ul>
            </li>    
        </div>
    )
}

export default foodBankListing
