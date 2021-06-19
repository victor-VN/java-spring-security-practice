package com.example.demo.dao;

import com.example.demo.model.UserEntity;

public interface UserDAO {

     UserEntity loadUserByUsername(String username);
}
