package com.springrentalbike.dao;

import com.springrentalbike.entities.BikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeRepository extends JpaRepository<BikeEntity, Long> {

     List<BikeEntity> findAll();

}
