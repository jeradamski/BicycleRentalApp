package com.springrentalbike.controllers;

import com.springrentalbike.dao.BikeRepository;
import com.springrentalbike.models.ClientModel;
import com.springrentalbike.models.OrderModel;
import com.springrentalbike.services.OrderService;
import org.springframework.web.bind.annotation.*;

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


