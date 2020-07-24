/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import com.enterpriseframework.data.AuditedEntity;

/**
 *
 * @author Home
 */
public class ContractTemplate extends AuditedEntity {
    
    private String name;
    private Double costPerSession;
    private Double totalSession;
    private int billingFrequency;
    private int contractDurationInWeeks;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCostPerSession() {
        return costPerSession;
    }

    public void setCostPerSession(Double costPerSession) {
        this.costPerSession = costPerSession;
    }

    public Double getTotalSession() {
        return totalSession;
    }

    public void setTotalSession(Double totalSession) {
        this.totalSession = totalSession;
    }

    public int getBillingFrequency() {
        return billingFrequency;
    }

    public void setBillingFrequency(int billingFrequency) {
        this.billingFrequency = billingFrequency;
    }

    public int getContractDurationInWeeks() {
        return contractDurationInWeeks;
    }

    public void setContractDurationInWeeks(int contractDurationInWeeks) {
        this.contractDurationInWeeks = contractDurationInWeeks;
    }
    
    
}
