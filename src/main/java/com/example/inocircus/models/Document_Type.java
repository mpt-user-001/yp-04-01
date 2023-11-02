package com.example.inocircus.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Document_Types")
public class Document_Type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Document_Type;
    @Column(length = 100, nullable = false, unique = true)
    private String Name_Type;

    public Document_Type() {}

    public Document_Type(int id, String name) {
        this.ID_Document_Type = id;
        this.Name_Type = name;
    }

    public int getID_Document_Type() {
        return ID_Document_Type;
    }

    public void setID_Document_Type(int ID_Document_Type) {
        this.ID_Document_Type = ID_Document_Type;
    }

    public String getName_Type() {
        return Name_Type;
    }

    public void setName_Type(String name_Type) {
        Name_Type = name_Type;
    }
}
