/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import core.InvoiceStatus;
import java.util.Date;
import javax.persistence.OneToMany;
import com.enterpriseframework.data.AuditedEntity;

/**
 *
 * @author Home
 */
public class Invoice  extends  AuditedEntity{
    
    private Date dueDate;
    private double invoiceAmount;
    private double totalPaid;
    private String invoiceNumber;
    private String description;
    private InvoiceStatus staus;
    private boolean autoPay;
    private int faildAttempts;
    private Long clientId;
    private Long sessionId;

    @OneToMany()
    private Client client;
    
    @OneToMany()
    private Contract contract;
    
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InvoiceStatus getStaus() {
        return staus;
    }

    public void setStaus(InvoiceStatus staus) {
        this.staus = staus;
    }

    public boolean isAutoPay() {
        return autoPay;
    }

    public void setAutoPay(boolean autoPay) {
        this.autoPay = autoPay;
    }

    public int getFaildAttempts() {
        return faildAttempts;
    }

    public void setFaildAttempts(int faildAttempts) {
        this.faildAttempts = faildAttempts;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }
    
    
    
}
