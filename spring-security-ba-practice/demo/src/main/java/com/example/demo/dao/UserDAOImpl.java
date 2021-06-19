package com.example.demo.dao;

import com.example.demo.model.UserEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public UserEntity loadUserByUsername(String username) {

        Session session = entityManager.unwrap(Session.class);

        Query<UserEntity> query = session.createQuery("from UserEntity where username=:username", UserEntity.class);
        query.setParameter("username", username);

        return query.getSingleResult();
    }
}
