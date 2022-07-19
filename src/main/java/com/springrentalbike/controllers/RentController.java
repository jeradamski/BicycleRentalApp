package com.springrentalbike.controllers;

import com.springrentalbike.dao.BikeRepository;
import com.springrentalbike.dao.OrderRepository;
import com.springrentalbike.models.BikeEntity;
import com.springrentalbike.models.ClientModel;
import com.springrentalbike.models.OrderEntity;
import com.springrentalbike.models.OrderModel;
import com.springrentalbike.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

@RestController
public class RentController {

    private final BikeRepository bikeRepository;
    private final OrderService orderService;


    public RentController(BikeRepository bikeRepository, OrderService orderService) {
        this.bikeRepository = bikeRepository;
        this.orderService = orderService;
    }

    @PostMapping("rent/{bikeId}")
    public String processBikeRental(@PathVariable Long bikeId,
                                    @ModelAttribute("client") @Valid ClientModel client,
                                    @ModelAttribute("order") @Valid OrderModel order


    ) {
        orderService.saveRent(bikeId,order,client);
        return "success";
    }
}


