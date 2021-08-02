package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Mobile;

public interface mobileRepo extends JpaRepository<Mobile,Serializable>{

}
