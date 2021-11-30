import Header from "./components/header";
import SearchBar from "./components/searchBar";
import Map from "./components/map";
import Scrollbox from "./components/scrollBox";


function App() {
  return (
    <div className="container">
      <Header />
      <SearchBar />
      <div className="map-and-scrollbox--container">
        <Map />
        <Scrollbox/>
      </div>
    </div>
  );
}

export default App;
