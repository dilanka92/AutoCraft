package com.autocraft.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "vehicle_repair", schema = "autocrafts", catalog = "")
public class VehicleRepair {
    private int repId;
    private Integer vehId;
    private Integer cusId;
    private String fault;
    private String remarks;
    private Integer status;
    private String tempCost;
    private String meter;
    private String remarks2;
    private Date addDate;
    private Integer invoiceNo;
    private Integer nextService;
    private String recivedItem;

    @Id
    @Column(name = "Rep_ID", nullable = false)
    public int getRepId() {
        return repId;
    }

    public void setRepId(int repId) {
        this.repId = repId;
    }

    @Basic
    @Column(name = "Veh_ID", nullable = true)
    public Integer getVehId() {
        return vehId;
    }

    public void setVehId(Integer vehId) {
        this.vehId = vehId;
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
    @Column(name = "Fault", nullable = true, length = 255)
    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
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
    @Column(name = "Status_", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "Temp_cost", nullable = true, length = 20)
    public String getTempCost() {
        return tempCost;
    }

    public void setTempCost(String tempCost) {
        this.tempCost = tempCost;
    }

    @Basic
    @Column(name = "Meter", nullable = true, length = 20)
    public String getMeter() {
        return meter;
    }

    public void setMeter(String meter) {
        this.meter = meter;
    }

    @Basic
    @Column(name = "Remarks2", nullable = true, length = 255)
    public String getRemarks2() {
        return remarks2;
    }

    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2;
    }

    @Basic
    @Column(name = "Add_Date", nullable = true)
    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "InvoiceNo", nullable = true)
    public Integer getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Integer invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @Basic
    @Column(name = "Next_Service", nullable = true)
    public Integer getNextService() {
        return nextService;
    }

    public void setNextService(Integer nextService) {
        this.nextService = nextService;
    }

    @Basic
    @Column(name = "RecivedItem", nullable = true, length = 50)
    public String getRecivedItem() {
        return recivedItem;
    }

    public void setRecivedItem(String recivedItem) {
        this.recivedItem = recivedItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleRepair that = (VehicleRepair) o;

        if (repId != that.repId) return false;
        if (vehId != null ? !vehId.equals(that.vehId) : that.vehId != null) return false;
        if (cusId != null ? !cusId.equals(that.cusId) : that.cusId != null) return false;
        if (fault != null ? !fault.equals(that.fault) : that.fault != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (tempCost != null ? !tempCost.equals(that.tempCost) : that.tempCost != null) return false;
        if (meter != null ? !meter.equals(that.meter) : that.meter != null) return false;
        if (remarks2 != null ? !remarks2.equals(that.remarks2) : that.remarks2 != null) return false;
        if (addDate != null ? !addDate.equals(that.addDate) : that.addDate != null) return false;
        if (invoiceNo != null ? !invoiceNo.equals(that.invoiceNo) : that.invoiceNo != null) return false;
        if (nextService != null ? !nextService.equals(that.nextService) : that.nextService != null) return false;
        if (recivedItem != null ? !recivedItem.equals(that.recivedItem) : that.recivedItem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repId;
        result = 31 * result + (vehId != null ? vehId.hashCode() : 0);
        result = 31 * result + (cusId != null ? cusId.hashCode() : 0);
        result = 31 * result + (fault != null ? fault.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (tempCost != null ? tempCost.hashCode() : 0);
        result = 31 * result + (meter != null ? meter.hashCode() : 0);
        result = 31 * result + (remarks2 != null ? remarks2.hashCode() : 0);
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + (invoiceNo != null ? invoiceNo.hashCode() : 0);
        result = 31 * result + (nextService != null ? nextService.hashCode() : 0);
        result = 31 * result + (recivedItem != null ? recivedItem.hashCode() : 0);
        return result;
    }
}
