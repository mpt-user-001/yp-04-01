package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "Logs")
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Log;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp DateTime_Log;
    @Column(nullable = false)
    private String Name_Log;
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "ID_User", nullable = false)
    private User ID_User;

    public Log() {}

    public Log(int id, Timestamp date, String name, User user) {
        this.ID_Log = id;
        this.DateTime_Log = date;
        this.Name_Log = name;
        this.ID_User = user;
    }

    public int getID_Log() {
        return ID_Log;
    }

    public void setID_Log(int ID_Log) {
        this.ID_Log = ID_Log;
    }

    public Timestamp getDateTime_Log() {
        return DateTime_Log;
    }

    public void setDateTime_Log(Timestamp dateTime_Log) {
        DateTime_Log = dateTime_Log;
    }

    public String getName_Log() {
        return Name_Log;
    }

    public void setName_Log(String name_Log) {
        Name_Log = name_Log;
    }

    public User getID_User() {
        return ID_User;
    }

    public void setID_User(User ID_User) {
        this.ID_User = ID_User;
    }
}
