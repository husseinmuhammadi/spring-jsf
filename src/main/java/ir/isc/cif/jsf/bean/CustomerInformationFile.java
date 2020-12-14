package ir.isc.cif.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "cif")
@ViewScoped
public class CustomerInformationFile {

    private String message = "CIF";


    public String add() {
        message = "add";
        return null;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
