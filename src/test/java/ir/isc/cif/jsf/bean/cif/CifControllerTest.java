package ir.isc.cif.jsf.bean.cif;

import ir.isc.cif.dto.CustomerInformationFile;
import ir.isc.cif.service.CifService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CifControllerTest {

    static CifService service;

    @BeforeAll
    static void beforeAll() {
        service = new CifService();
    }

    // Mock Api
    @Test
    void givenCallRestfulApi_whenGettingListOfAllCifs_thenReturnMockData() {
        CifService mockService = mock(CifService.class);
        when(mockService.findAll())
                .thenReturn(Arrays.asList(
                        CustomerInformationFile.builder().customerId("1544").customerName("Hamed").build(),
                        CustomerInformationFile.builder().customerName("Mohammad").build(),
                        CustomerInformationFile.builder().customerName("Maryam1").build(),
                        CustomerInformationFile.builder().customerName("Maryam1").build()
                ));

        assertTrue(mockService.findAll().size()==4);
    }
}