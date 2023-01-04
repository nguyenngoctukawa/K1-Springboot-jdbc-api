package com.example.nbs.springbasic.dataaccess.SpringjdbcJPA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJPAPlayerRepository extends JpaRepository<PlayerEntity, Integer> {
}
