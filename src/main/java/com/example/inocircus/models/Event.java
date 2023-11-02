package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "Events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Event;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp DateTime_Event;
    @Column(nullable = false)
    private double Duration_Event;
    @Column()
    private int Age_Limit;
    @Column()
    private double Price_Event;
    @ManyToOne(targetEntity = Area.class)
    @JoinColumn(name = "ID_Area", nullable = false)
    private Area ID_Area;

    public Event() {}

    public Event(int id, Timestamp date, double dr, int pg, double pm, Area area) {
        this.ID_Event = id;
        this.DateTime_Event = date;
        this.Duration_Event = dr;
        this.Age_Limit = pg;
        this.Price_Event = pm;
        this.ID_Area = area;
    }

    public int getID_Event() {
        return ID_Event;
    }

    public void setID_Event(int ID_Event) {
        this.ID_Event = ID_Event;
    }

    public Timestamp getDateTime_Event() {
        return DateTime_Event;
    }

    public void setDateTime_Event(Timestamp dateTime_Event) {
        DateTime_Event = dateTime_Event;
    }

    public double getDuration_Event() {
        return Duration_Event;
    }

    public void setDuration_Event(double duration_Event) {
        Duration_Event = duration_Event;
    }

    public int getAge_Limit() {
        return Age_Limit;
    }

    public void setAge_Limit(int age_Limit) {
        Age_Limit = age_Limit;
    }

    public double getPrice_Event() {
        return Price_Event;
    }

    public void setPrice_Event(double price_Event) {
        Price_Event = price_Event;
    }

    public Area getID_Area() {
        return ID_Area;
    }

    public void setID_Area(Area ID_Area) {
        this.ID_Area = ID_Area;
    }
}
