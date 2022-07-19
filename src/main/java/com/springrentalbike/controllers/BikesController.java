package com.springrentalbike.controllers;

import com.springrentalbike.dao.BikeRepository;
import com.springrentalbike.models.BikeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/bikes-list")
@RestController
public class BikesController {

    @Autowired
    private BikeRepository dao;

    @GetMapping
    public List<BikeEntity> list() {return dao.findAll();}


}
