package ir.isc.cif.jsf.bean.cif;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CifController implements Serializable {

    private static final long serialVersionUID = 8289525134464111672L;

    public CifController() {
        System.out.println("CifController#ctor");
    }

    public String entry() {
        return "insert";
    }

    public void save(ActionEvent event) {

    }
}
