package com.springrentalbike.controllers;


import com.springrentalbike.dao.BikeRepository;
import com.springrentalbike.dao.OrderRepository;
import com.springrentalbike.models.BikeEntity;
import com.springrentalbike.models.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/rentals")
public class RentalsController {

    @Autowired
    private OrderRepository dao;

    @GetMapping
    public List<OrderEntity> list() {return dao.findAll();}

}
