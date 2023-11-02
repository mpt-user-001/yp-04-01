package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Employee;
    @ManyToOne(targetEntity = Area.class)
    @JoinColumn(name = "ID_Area", nullable = false)
    private Area ID_Area;
    @ManyToOne(targetEntity = Employee_Post.class)
    @JoinColumn(name = "ID_Employee_Post", nullable = false)
    private Employee_Post ID_Employee_Post;
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "ID_User", nullable = false)
    private User ID_User;

    public Employee() {}

    public Employee(int id, Area date, Employee_Post name, User user) {
        this.ID_Employee = id;
        this.ID_Area = date;
        this.ID_Employee_Post = name;
        this.ID_User = user;
    }

    public int getID_Employee() {
        return ID_Employee;
    }

    public void setID_Employee(int ID_Employee) {
        this.ID_Employee = ID_Employee;
    }

    public Area getID_Area() {
        return ID_Area;
    }

    public void setID_Area(Area ID_Area) {
        this.ID_Area = ID_Area;
    }

    public Employee_Post getID_Employee_Post() {
        return ID_Employee_Post;
    }

    public void setID_Employee_Post(Employee_Post ID_Employee_Post) {
        this.ID_Employee_Post = ID_Employee_Post;
    }

    public User getID_User() {
        return ID_User;
    }

    public void setID_User(User ID_User) {
        this.ID_User = ID_User;
    }
}
