import React, { useEffect, useState }  from 'react';

    export const useFetch = () => {
    
      const [data, setData] = useState([])
      const [loading, setLoading] = useState(false)
      const [error, setError] = useState(null)
    
      useEffect(() => {
    
        setLoading(true)
        setError(null)
    
        fetch('http://127.0.0.1:8080/v1/api/food_bank_list')
          .then(res => res.json())
          .then(json => {
            setLoading(false)
            if (json.data) {
              setData(json.data)
            } else {
              setData([])
            }
          })
          .catch(err => {
            setError(err)
            setLoading(false)
          })
      }, [])
      return { data, loading, error }
    }

    export default useFetch;