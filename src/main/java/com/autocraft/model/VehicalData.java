package com.autocraft.model;

import javax.persistence.*;

@Entity
@Table(name = "vehical_data", schema = "autocrafts", catalog = "")
public class VehicalData {
    private int vId;
    private String chasseNo;
    private String regNo;
    private String engNo;
    private Integer cusId;
    private String brand;
    private String model;
    private String category;
    private String option;
    private String pic1;
    private String remarks;
    private String transmition;
    private String fuel;
    private Integer year;

    @Id
    @Column(name = "V_Id", nullable = false)
    public int getvId() {
        return vId;
    }

    public void setvId(int vId) {
        this.vId = vId;
    }

    @Basic
    @Column(name = "Chasse_No", nullable = true, length = 20)
    public String getChasseNo() {
        return chasseNo;
    }

    public void setChasseNo(String chasseNo) {
        this.chasseNo = chasseNo;
    }

    @Basic
    @Column(name = "Reg_No", nullable = true, length = 20)
    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    @Basic
    @Column(name = "Eng_No", nullable = true, length = 50)
    public String getEngNo() {
        return engNo;
    }

    public void setEngNo(String engNo) {
        this.engNo = engNo;
    }

    @Basic
    @Column(name = "Cus_ID", nullable = true)
    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    @Basic
    @Column(name = "Brand", nullable = true, length = 50)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "Model", nullable = true, length = 100)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "Category", nullable = true, length = 100)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "Option", nullable = true, length = 100)
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Basic
    @Column(name = "pic1", nullable = true, length = 100)
    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    @Basic
    @Column(name = "Remarks", nullable = true, length = 255)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "Transmition", nullable = true, length = 25)
    public String getTransmition() {
        return transmition;
    }

    public void setTransmition(String transmition) {
        this.transmition = transmition;
    }

    @Basic
    @Column(name = "Fuel", nullable = true, length = 25)
    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Basic
    @Column(name = "Year", nullable = true)
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicalData that = (VehicalData) o;

        if (vId != that.vId) return false;
        if (chasseNo != null ? !chasseNo.equals(that.chasseNo) : that.chasseNo != null) return false;
        if (regNo != null ? !regNo.equals(that.regNo) : that.regNo != null) return false;
        if (engNo != null ? !engNo.equals(that.engNo) : that.engNo != null) return false;
        if (cusId != null ? !cusId.equals(that.cusId) : that.cusId != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (option != null ? !option.equals(that.option) : that.option != null) return false;
        if (pic1 != null ? !pic1.equals(that.pic1) : that.pic1 != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (transmition != null ? !transmition.equals(that.transmition) : that.transmition != null) return false;
        if (fuel != null ? !fuel.equals(that.fuel) : that.fuel != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vId;
        result = 31 * result + (chasseNo != null ? chasseNo.hashCode() : 0);
        result = 31 * result + (regNo != null ? regNo.hashCode() : 0);
        result = 31 * result + (engNo != null ? engNo.hashCode() : 0);
        result = 31 * result + (cusId != null ? cusId.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (option != null ? option.hashCode() : 0);
        result = 31 * result + (pic1 != null ? pic1.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (transmition != null ? transmition.hashCode() : 0);
        result = 31 * result + (fuel != null ? fuel.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }
}
