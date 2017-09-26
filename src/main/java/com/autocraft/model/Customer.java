package com.autocraft.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    private int cusId;
    private String cName;
    private String cAddress;
    private String cEmail;
    private String cContact;
    private String nic;

    @Id
    @Column(name = "Cus_ID", nullable = false)
    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    @Basic
    @Column(name = "C_Name", nullable = false, length = 20)
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Basic
    @Column(name = "C_Address", nullable = false, length = 100)
    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    @Basic
    @Column(name = "C_Email", nullable = false, length = 50)
    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    @Basic
    @Column(name = "C_Contact", nullable = false, length = 20)
    public String getcContact() {
        return cContact;
    }

    public void setcContact(String cContact) {
        this.cContact = cContact;
    }

    @Basic
    @Column(name = "NIC", nullable = false, length = 10)
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (cusId != customer.cusId) return false;
        if (cName != null ? !cName.equals(customer.cName) : customer.cName != null) return false;
        if (cAddress != null ? !cAddress.equals(customer.cAddress) : customer.cAddress != null) return false;
        if (cEmail != null ? !cEmail.equals(customer.cEmail) : customer.cEmail != null) return false;
        if (cContact != null ? !cContact.equals(customer.cContact) : customer.cContact != null) return false;
        if (nic != null ? !nic.equals(customer.nic) : customer.nic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cusId;
        result = 31 * result + (cName != null ? cName.hashCode() : 0);
        result = 31 * result + (cAddress != null ? cAddress.hashCode() : 0);
        result = 31 * result + (cEmail != null ? cEmail.hashCode() : 0);
        result = 31 * result + (cContact != null ? cContact.hashCode() : 0);
        result = 31 * result + (nic != null ? nic.hashCode() : 0);
        return result;
    }
}
