package com.oes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oes.entity.user;
public interface userrepository extends JpaRepository<user, Long>{
	
}
