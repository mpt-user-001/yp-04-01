package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_User;
    @Column(length = 120, nullable = false)
    private String First_Name;
    @Column(length = 60, nullable = false)
    private String Last_Name;
    @Column(length = 180)
    private String Middle_Name;
    @Column(length = 300, nullable = false, unique = true)
    private String email;
    @Column(length = 128, nullable = false)
    private String Password;
    @Column(length = 100)
    private String Nearest_City;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp Date_Register;

    public User() {}

    public User (int id, String last_name, String first_name, String middle_name, String email, String password, String nearest_city, Timestamp date) {
        this.ID_User = id;
        this.First_Name = first_name;
        this.Last_Name = last_name;
        this.Middle_Name = middle_name;
        this.email = email;
        this.Password = password;
        this.Nearest_City = nearest_city;
        this.Date_Register = date;
    }

    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getMiddle_Name() {
        return Middle_Name;
    }

    public void setMiddle_Name(String middle_Name) {
        Middle_Name = middle_Name;
    }

    public String getEmail_User() {
        return email;
    }

    public void setEmail_User(String email_User) {
        email = email_User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNearest_City() {
        return Nearest_City;
    }

    public void setNearest_City(String nearest_City) {
        Nearest_City = nearest_City;
    }

    public Timestamp getDate_Register() {
        return Date_Register;
    }

    public void setDate_Register(Timestamp date_Register) {
        Date_Register = date_Register;
    }
}
