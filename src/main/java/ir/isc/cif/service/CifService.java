package ir.isc.cif.service;

import ir.isc.cif.dto.CIF;
import ir.isc.cif.dto.CustomerInformationFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class CifService {
    public CIF save(CIF cif) {
        try {
            URL url = new URL("http://localhost:8700/api/v1/cifs");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();
            return cif;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<CustomerInformationFile> findAll() {
        try {
            URL url = new URL("http://localhost:8700/api/v1/cifs");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Arrays.asList(
                CustomerInformationFile.builder().customerId("1544").customerName("Hamed").build(),
                CustomerInformationFile.builder().customerName("Mohammad").build(),
                CustomerInformationFile.builder().customerName("Maryam").build()
        );
    }
}
