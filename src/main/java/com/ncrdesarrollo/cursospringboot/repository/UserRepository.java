package com.ncrdesarrollo.cursospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ncrdesarrollo.cursospringboot.empty.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
