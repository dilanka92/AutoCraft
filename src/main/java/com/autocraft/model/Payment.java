package com.autocraft.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Payment {
    private int paymentId;
    private Integer repId;
    private String pType;
    private Double amount;
    private String reciptNo;
    private String description;
    private Date addDate;

    @Id
    @Column(name = "payment_ID", nullable = false)
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    @Basic
    @Column(name = "Rep_ID", nullable = true)
    public Integer getRepId() {
        return repId;
    }

    public void setRepId(Integer repId) {
        this.repId = repId;
    }

    @Basic
    @Column(name = "P_Type", nullable = true, length = 50)
    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    @Basic
    @Column(name = "Amount", nullable = true, precision = 0)
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "ReciptNo", nullable = true, length = 10)
    public String getReciptNo() {
        return reciptNo;
    }

    public void setReciptNo(String reciptNo) {
        this.reciptNo = reciptNo;
    }

    @Basic
    @Column(name = "Description", nullable = true, length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "AddDate", nullable = true)
    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (paymentId != payment.paymentId) return false;
        if (repId != null ? !repId.equals(payment.repId) : payment.repId != null) return false;
        if (pType != null ? !pType.equals(payment.pType) : payment.pType != null) return false;
        if (amount != null ? !amount.equals(payment.amount) : payment.amount != null) return false;
        if (reciptNo != null ? !reciptNo.equals(payment.reciptNo) : payment.reciptNo != null) return false;
        if (description != null ? !description.equals(payment.description) : payment.description != null) return false;
        if (addDate != null ? !addDate.equals(payment.addDate) : payment.addDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = paymentId;
        result = 31 * result + (repId != null ? repId.hashCode() : 0);
        result = 31 * result + (pType != null ? pType.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (reciptNo != null ? reciptNo.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        return result;
    }
}
