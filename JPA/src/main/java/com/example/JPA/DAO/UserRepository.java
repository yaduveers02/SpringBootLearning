package com.example.JPA.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.JPA.Entiry.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
