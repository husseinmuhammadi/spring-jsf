package ir.isc.cif.jsf.bean.cif;

import ir.isc.cif.dto.CIF;
import ir.isc.cif.service.CifService;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CifController implements Serializable {

    private static final long serialVersionUID = 8289525134464111672L;

    private CifService service = new CifService();

    public CifController() {
        System.out.println("CifController#ctor");
    }

    private CIF cif = new CIF();

    public String entry() {
        return "insert";
    }

    public void save(ActionEvent event) {
        service.save(cif);
    }

    public CIF getCif() {
        return cif;
    }

    public void setCif(CIF cif) {
        this.cif = cif;
    }
}
