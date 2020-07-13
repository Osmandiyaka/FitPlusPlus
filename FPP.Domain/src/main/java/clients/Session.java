/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

import core.SessionStatus;
import core.SessionType;
import java.util.Date;
import javax.persistence.OneToMany;
import lib.AuditedEntity;

/**
 *
 * @author Home
 */
public class Session  extends AuditedEntity{
    
    private Date scheduleDate;
    private String scheduleTime;
    private SessionStatus status;
    private SessionType type;
   
    @OneToMany()
    private Client client;
   
    @OneToMany()
    private Contract contract;
            
    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public SessionStatus getStatus() {
        return status;
    }

    public void setStatus(SessionStatus status) {
        this.status = status;
    }

    public SessionType getType() {
        return type;
    }

    public void setType(SessionType type) {
        this.type = type;
    }
}
