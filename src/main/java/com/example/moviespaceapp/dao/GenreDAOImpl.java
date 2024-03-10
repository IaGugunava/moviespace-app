package com.example.moviespaceapp.dao;

import com.example.moviespaceapp.entity.Genre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class GenreDAOImpl implements GenreDAO{

    private EntityManager entityManager;

    @Autowired
    public GenreDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Genre genre) {
        entityManager.persist(genre);
    }

    @Override
    public Genre findByID(int id) {
        return entityManager.find(Genre.class, id);
    }

    @Override
    public List<Genre> findAll() {
        TypedQuery<Genre> typedQuery = entityManager.createQuery("FROM Genre order by id", Genre.class);

        return typedQuery.getResultList();
    }

    @Override
    public List<Genre> findByName(String name) {
        TypedQuery<Genre> typedQuery = entityManager.createQuery("FROM Genre order by id WHERE genre=:name", Genre.class);

        typedQuery.setParameter("name", name);

        return typedQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Genre genre) {
        entityManager.merge(genre);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Genre genre = entityManager.find(Genre.class ,id);

        entityManager.remove(genre);
    }


}
