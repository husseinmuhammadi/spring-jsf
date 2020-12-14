package ir.isc.cif.service;

import ir.isc.cif.dto.CustomerInformationFile;

import java.util.Arrays;
import java.util.List;

public class CifService {
    public List<CustomerInformationFile> findAll() {
        return Arrays.asList(
                CustomerInformationFile.builder().customerId("1544").customerName("Hamed").build(),
                CustomerInformationFile.builder().customerName("Mohammad").build(),
                CustomerInformationFile.builder().customerName("Maryam").build()
        );
    }
}
