package com.example.inocircus.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@Table(name = "Area_Ratings")
public class Area_Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Area_Rating;
    @Column(nullable = false)
    private double Rating;
    @ManyToOne(targetEntity = Ticket.class)
    @JoinColumn(name = "ID_Ticket", nullable = false)
    private Ticket ID_Ticket;
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "ID_User", nullable = false)
    private User ID_User;

    public Area_Rating() {}

    public Area_Rating(int id, double rating, Ticket ticket, User user) {
        this.ID_Area_Rating = id;
        this.Rating = rating;
        this.ID_Ticket = ticket;
        this.ID_User = user;
    }

    public int getID_Area_Rating() {
        return ID_Area_Rating;
    }

    public void setID_Area_Rating(int ID_Area_Rating) {
        this.ID_Area_Rating = ID_Area_Rating;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }

    public Ticket getID_Ticket() {
        return ID_Ticket;
    }

    public void setID_Ticket(Ticket ID_Ticket) {
        this.ID_Ticket = ID_Ticket;
    }

    public User getID_User() {
        return ID_User;
    }

    public void setID_User(User ID_User) {
        this.ID_User = ID_User;
    }
}
