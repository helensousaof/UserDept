package com.helensousa.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helensousa.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
