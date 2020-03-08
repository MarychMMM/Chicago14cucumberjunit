package apiModules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

public class Contact {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonIgnoreProperties(ignoreUnknown = true)
    String ohone;
    String address;

    public String getOhone() {
        return ohone;
    }

    public void setOhone(String ohone) {
        this.ohone = ohone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
