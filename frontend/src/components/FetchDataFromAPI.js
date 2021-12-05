

const FetchDataFromAPI = ({url}) => {

  return (
    fetch({url})
    .then((response) => response.json())
  )
}

export default FetchDataFromAPI;
