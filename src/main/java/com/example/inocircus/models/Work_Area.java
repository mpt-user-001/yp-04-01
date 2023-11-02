package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "Work_Area")
public class Work_Area {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Work_Area;
    @Column()
    private int Day_Week;
    @Column(nullable = false)
    private Time Time_Discovery;
    @Column(nullable = false)
    private Time Time_Closure;
    @ManyToOne(targetEntity = Area.class)
    @JoinColumn(name = "Area_ID", nullable = false)
    private Area ID_Area;

    public Work_Area() {}

    public Work_Area(int id, int date, Time dr, Time pg, Area area) {
        this.ID_Work_Area = id;
        this.Day_Week = date;
        this.Time_Discovery = dr;
        this.Time_Closure = pg;
        this.ID_Area = area;
    }

    public int getID_Work_Area() {
        return ID_Work_Area;
    }

    public void setID_Work_Area(int ID_Work_Area) {
        this.ID_Work_Area = ID_Work_Area;
    }

    public int getDay_Week() {
        return Day_Week;
    }

    public void setDay_Week(int day_Week) {
        Day_Week = day_Week;
    }

    public Time getTime_Discovery() {
        return Time_Discovery;
    }

    public void setTime_Discovery(Time time_Discovery) {
        Time_Discovery = time_Discovery;
    }

    public Time getTime_Closure() {
        return Time_Closure;
    }

    public void setTime_Closure(Time time_Closure) {
        Time_Closure = time_Closure;
    }

    public Area getID_Area() {
        return ID_Area;
    }

    public void setID_Area(Area ID_Area) {
        this.ID_Area = ID_Area;
    }
}
