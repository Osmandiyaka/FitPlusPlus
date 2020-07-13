/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Home
 */
@Entity
public class Client extends User {

    private static final long serialVersionUID = 1L;
    private boolean isOnboarded;
    private String emergencyContact;
    private String note;

    @ManyToOne(cascade = CascadeType.ALL)
    private Collection<Contract> contracts;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Collection<Session>sessions;

    public Collection<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Collection<Contract> contracts) {
        this.contracts = contracts;
    }
    
    public boolean isIsOnboarded() {
        return isOnboarded;
    }

    public void setIsOnboarded(boolean isOnboarded) {
        this.isOnboarded = isOnboarded;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
}
