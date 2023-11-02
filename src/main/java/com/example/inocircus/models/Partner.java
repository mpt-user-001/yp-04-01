package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "Partners")
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Partner;
    @Column(nullable = false, unique = true)
    private String Name_Partner;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp DateTime_Created;
    @Column(nullable = false)
    private String URL_Logo_Partner;
    @ManyToOne(targetEntity = Area.class)
    @JoinColumn(name = "ID_Area", nullable = false)
    private Area ID_Area;

    public Partner() {}

    public Partner(int id, String name, Timestamp date, String url, Area area) {
        this.ID_Partner = id;
        this.Name_Partner = name;
        this.DateTime_Created = date;
        this.URL_Logo_Partner = url;
        this.ID_Area = area;
    }

    public int getID_Partner() {
        return ID_Partner;
    }

    public void setID_Partner(int ID_Partner) {
        this.ID_Partner = ID_Partner;
    }

    public String getName_Partner() {
        return Name_Partner;
    }

    public void setName_Partner(String name_Partner) {
        Name_Partner = name_Partner;
    }

    public Timestamp getDateTime_Created() {
        return DateTime_Created;
    }

    public void setDateTime_Created(Timestamp dateTime_Created) {
        DateTime_Created = dateTime_Created;
    }

    public String getURL_Logo_Partner() {
        return URL_Logo_Partner;
    }

    public void setURL_Logo_Partner(String URL_Logo_Partner) {
        this.URL_Logo_Partner = URL_Logo_Partner;
    }

    public Area getID_Area() {
        return ID_Area;
    }

    public void setID_Area(Area ID_Area) {
        this.ID_Area = ID_Area;
    }
}
