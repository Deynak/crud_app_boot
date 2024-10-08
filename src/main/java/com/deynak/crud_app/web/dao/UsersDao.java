package com.deynak.crud_app.web.dao;

import com.deynak.crud_app.web.entity.Users;

import java.util.List;

public interface UsersDao {
    List<Users> readingAllUsers();

    Users readUser(Long id);

    void saveUser(Users user);

    void updateUser(Long id, Users user);

    void deleteUser(Long id);

}
