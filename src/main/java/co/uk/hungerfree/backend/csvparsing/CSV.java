package co.uk.hungerfree.backend.csvparsing;

import co.uk.hungerfree.backend.model.TownFinder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CSV {

    public static List<TownFinder> parse(){

        List<TownFinder> townFinderList = new ArrayList<>();

        try{
            URL resource = CSV.class.getClassLoader().getResource("static/csv/UKPlaces.csv");
            assert resource != null;
            CSVReader reader=
                    new CSVReaderBuilder(new InputStreamReader(resource.openStream())).
                            withSkipLines(1). // Skip  header
                            build();
            townFinderList = reader.readAll().stream().map(data-> {
                TownFinder townFinder = new TownFinder();
                townFinder.setId(Long.valueOf(data[0]));
                townFinder.setName(data[1]);
                townFinder.setCounty(data[2]);
                townFinder.setCountry(data[3]);
                townFinder.setLatitude(Double.parseDouble(data[7]));
                townFinder.setLongitude(Double.parseDouble(data[8]));
                townFinder.setPostcode_area(data[9]);
                return townFinder;
            }).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return townFinderList;
    }
}
