package ir.isc.cif.jsf.bean.cif;

import ir.isc.cif.dto.CustomerInformationFile;
import ir.isc.cif.service.CifService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class CifManager {

    public CifManager() {
        System.out.println("CifManager#ctor");
    }

    private List<CustomerInformationFile> cifs = new ArrayList<>();

    private CifService service = new CifService();

    public void findAll() {
        cifs = service.findAll();
        System.out.println(MessageFormat.format("{0}", cifs.size()));
    }

    public List<CustomerInformationFile> getCifs() {
        return cifs;
    }
}
