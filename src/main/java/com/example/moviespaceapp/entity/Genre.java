package com.example.moviespaceapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public Genre() {
    }

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
