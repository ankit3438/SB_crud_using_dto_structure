package com.DtoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DtoApplication.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
