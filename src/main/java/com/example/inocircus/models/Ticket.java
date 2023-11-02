package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "Tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Ticket;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp Date_Buy;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp Date_Use;
    @ManyToOne(targetEntity = Receipt.class)
    @JoinColumn(name = "ID_Receipt", nullable = false)
    private Receipt ID_Receipt;
    @ManyToOne(targetEntity = Event.class)
    @JoinColumn(name = "ID_Event", nullable = false)
    private Event ID_Event;
    @ManyToOne(targetEntity = Area.class)
    @JoinColumn(name = "ID_Area", nullable = false)
    private Area ID_Area;
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "ID_User", nullable = false)
    private User ID_User;

    public Ticket() {}

    public Ticket(int id, Timestamp date, Timestamp date2, Receipt receipt, Event event, Area area, User user) {
        this.ID_Ticket = id;
        this.Date_Buy = date;
        this.Date_Use = date2;
        this.ID_Receipt = receipt;
        this.ID_Event = event;
        this.ID_Area = area;
        this.ID_User = user;
    }

    public int getID_Ticket() {
        return ID_Ticket;
    }

    public void setID_Ticket(int ID_Ticket) {
        this.ID_Ticket = ID_Ticket;
    }

    public Timestamp getDate_Buy() {
        return Date_Buy;
    }

    public void setDate_Buy(Timestamp date_Buy) {
        Date_Buy = date_Buy;
    }

    public Timestamp getDate_Use() {
        return Date_Use;
    }

    public void setDate_Use(Timestamp date_Use) {
        Date_Use = date_Use;
    }

    public Receipt getID_Receipt() {
        return ID_Receipt;
    }

    public void setID_Receipt(Receipt ID_Receipt) {
        this.ID_Receipt = ID_Receipt;
    }

    public Event getID_Event() {
        return ID_Event;
    }

    public void setID_Event(Event ID_Event) {
        this.ID_Event = ID_Event;
    }

    public Area getID_Area() {
        return ID_Area;
    }

    public void setID_Area(Area ID_Area) {
        this.ID_Area = ID_Area;
    }

    public User getID_User() {
        return ID_User;
    }

    public void setID_User(User ID_User) {
        this.ID_User = ID_User;
    }
}
