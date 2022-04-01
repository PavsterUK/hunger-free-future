package co.uk.hungerfree.backend.jsonparsing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class API {

    public static String readJsonFromUrlToString (URL url) {
        StringBuilder jsonSrt = new StringBuilder();

        try {
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            if(connection.getResponseCode() == 200) {
                Scanner scan = new Scanner(url.openStream());
                while(scan.hasNext()) {
                    jsonSrt.append(scan.nextLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonSrt.toString();
    }


}
