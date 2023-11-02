package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@Table(name = "Support_Status")
public class Support_Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Support_Status;
    @Column(length = 90, nullable = false, unique = true)
    private String Name_Status;

    public Support_Status() {}

    public Support_Status(int id, String name) {
        this.ID_Support_Status = id;
        this.Name_Status = name;
    }

    public int getID_Support_Status() {
        return ID_Support_Status;
    }

    public void setID_Support_Status(int ID_Support_Status) {
        this.ID_Support_Status = ID_Support_Status;
    }

    public String getName_Status() {
        return Name_Status;
    }

    public void setName_Status(String name_Status) {
        Name_Status = name_Status;
    }
}
