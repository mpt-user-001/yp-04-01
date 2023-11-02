package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@Table(name = "Employee_Posts")
public class Employee_Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Employee_Post;
    @Column(length = 45, nullable = false, unique = true)
    private String Name_Post;

    public Employee_Post() {}

    public Employee_Post(int id, String name) {
        this.ID_Employee_Post = id;
        this.Name_Post = name;
    }

    public int getID_Employee_Post() {
        return ID_Employee_Post;
    }

    public void setID_Employee_Post(int ID_Employee_Post) {
        this.ID_Employee_Post = ID_Employee_Post;
    }

    public String getName_Post() {
        return Name_Post;
    }

    public void setName_Post(String name_Post) {
        Name_Post = name_Post;
    }
}
