package com.example.moviespaceapp.dao;

import com.example.moviespaceapp.entity.Genre;

import java.util.List;

public interface GenreDAO {
    void save(Genre genre);

    Genre findByID(int id);

    List<Genre> findAll();

    List<Genre> findByName(String name);

    void update(Genre genre);

    void delete(int id);
}
