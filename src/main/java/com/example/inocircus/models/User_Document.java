package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@Table(name = "User_Documents")
public class User_Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_User_Document;
    @Column(nullable = false)
    private String Address;
    @Column(length = 100)
    private String Number_Document;
    @Column(length = 45)
    private String SAND;
    @Column(length = 10, nullable = false)
    private String Gender;
    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "ID_User", nullable = false)
    private User ID_User;
    @ManyToOne(targetEntity = Document_Type.class)
    @JoinColumn(name = "ID_Document_Type", nullable = false)
    private Document_Type ID_Document_Type;

    public User_Document() {}

    public User_Document(int id, String address, String nb, String sand, String gender, User user, Document_Type dt) {
        this.ID_User_Document = id;
        this.Address = address;
        this.Number_Document = nb;
        this.SAND = sand;
        this.Gender = gender;
        this.ID_User = user;
        this.ID_Document_Type = dt;
    }

    public int getID_User_Document() {
        return ID_User_Document;
    }

    public void setID_User_Document(int ID_User_Document) {
        this.ID_User_Document = ID_User_Document;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNumber_Document() {
        return Number_Document;
    }

    public void setNumber_Document(String number_Document) {
        Number_Document = number_Document;
    }

    public String getSAND() {
        return SAND;
    }

    public void setSAND(String SAND) {
        this.SAND = SAND;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public User getID_User() {
        return ID_User;
    }

    public void setID_User(User ID_User) {
        this.ID_User = ID_User;
    }

    public Document_Type getID_Document_Type() {
        return ID_Document_Type;
    }

    public void setID_Document_Type(Document_Type ID_Document_Type) {
        this.ID_Document_Type = ID_Document_Type;
    }
}
