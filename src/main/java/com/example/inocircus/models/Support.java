package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "Supports")
public class Support {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Support;
    @Column(nullable = false, length = 200)
    private String Name_Support;
    @Column(nullable = false)
    private String Text_Support;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp Date_Open;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp Date_Close;
    @ManyToOne(targetEntity = Support_Status.class)
    @JoinColumn(name = "ID_Support_Status", nullable = false)
    private Support_Status ID_Support_Status;
    @ManyToOne(targetEntity = Employee.class)
    @JoinColumn(name = "ID_Employee")
    private Employee ID_Employee;
    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "ID_User", nullable = false)
    private User ID_User;

    public Support() {}

    public Support(int id, String name, String text, Timestamp open, Timestamp close, Support_Status sp, Employee emp, User user) {
        this.ID_Support = id;
        this.Name_Support = name;
        this.Text_Support = text;
        this.Date_Open = open;
        this.Date_Close = close;
        this.ID_Support_Status = sp;
        this.ID_Employee = emp;
        this.ID_User = user;
    }

    public int getID_Support() {
        return ID_Support;
    }

    public void setID_Support(int ID_Support) {
        this.ID_Support = ID_Support;
    }

    public String getName_Support() {
        return Name_Support;
    }

    public void setName_Support(String name_Support) {
        Name_Support = name_Support;
    }

    public String getText_Support() {
        return Text_Support;
    }

    public void setText_Support(String text_Support) {
        Text_Support = text_Support;
    }

    public Timestamp getDate_Open() {
        return Date_Open;
    }

    public void setDate_Open(Timestamp date_Open) {
        Date_Open = date_Open;
    }

    public Timestamp getDate_Close() {
        return Date_Close;
    }

    public void setDate_Close(Timestamp date_Close) {
        Date_Close = date_Close;
    }

    public Support_Status getID_Support_Status() {
        return ID_Support_Status;
    }

    public void setID_Support_Status(Support_Status ID_Support_Status) {
        this.ID_Support_Status = ID_Support_Status;
    }

    public Employee getID_Employee() {
        return ID_Employee;
    }

    public void setID_Employee(Employee ID_Employee) {
        this.ID_Employee = ID_Employee;
    }

    public User getID_User() {
        return ID_User;
    }

    public void setID_User(User ID_User) {
        this.ID_User = ID_User;
    }
}
