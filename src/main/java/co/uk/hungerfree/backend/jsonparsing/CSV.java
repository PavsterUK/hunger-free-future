package co.uk.hungerfree.backend.jsonparsing;

import co.uk.hungerfree.backend.model.UkAddress;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CSV {

    public static List<UkAddress> parse(){

        List<UkAddress> ukAddressList = new ArrayList<>();

        try{
            URL resource = CSV.class.getClassLoader().getResource("static/csv/UKPlaces.csv");
            assert resource != null;
            CSVReader reader=
                    new CSVReaderBuilder(new InputStreamReader(resource.openStream())).
                            withSkipLines(1). // Skip  header
                            build();
            ukAddressList = reader.readAll().stream().map(data-> {
                UkAddress ukAddress = new UkAddress();
                ukAddress.setId(Long.valueOf(data[0]));
                ukAddress.setName(data[1]);
                ukAddress.setCounty(data[2]);
                ukAddress.setCountry(data[3]);
                ukAddress.setLatitude(Double.parseDouble(data[7]));
                ukAddress.setLongitude(Double.parseDouble(data[8]));
                ukAddress.setPostcode_area(data[9]);
                return ukAddress;
            }).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ukAddressList;
    }
}
