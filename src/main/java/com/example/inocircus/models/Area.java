package com.example.inocircus.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@Table(name = "Area")
@Getter
@Setter
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Area;
    @Column(length = 128, nullable = false, unique = true)
    private String Name_Area;
    @Column(nullable = false)
    private String Address_Area;
    @Column(nullable = false)
    private double Price_Entry;
    @Column(nullable = false)
    private int Age_Limit_Area;

    public Area() {}

    public Area(int id, String name, String address, double price, int age) {
        this.ID_Area = id;
        this.Name_Area = name;
        this.Address_Area = address;
        this.Price_Entry = price;
        this.Age_Limit_Area = age;
    }
}
