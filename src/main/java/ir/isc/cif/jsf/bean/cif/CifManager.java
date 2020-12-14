package ir.isc.cif.jsf.bean.cif;

import ir.isc.cif.dto.CustomerInformationFile;
import ir.isc.cif.service.CifService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
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
