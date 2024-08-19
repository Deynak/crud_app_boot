package com.deynak.crud_app.web.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.deynak.crud_app.web.entity.Users;


import java.util.List;

@Repository
public class UsersDaoImp implements UsersDao {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Users> readingAllUsers() {
        return em.createQuery("from Users").getResultList();
    }

    @Override
    public Users readUser(Long id) {
        return em.find(Users.class, id);
    }

    @Override
    public void saveUser(Users user) {
        em.persist(user);
    }

    @Override
    public void updateUser(Long id, Users user) {
        em.merge(user);
    }

    @Override
    public void deleteUser(Long id) {
        em.remove(em.find(Users.class, id));
    }
}
