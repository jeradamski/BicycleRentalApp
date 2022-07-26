package com.springrentalbike.controllers;

import com.springrentalbike.dao.BikeRepository;
import com.springrentalbike.entities.BikeEntity;
import com.springrentalbike.models.BikeModel;
import com.springrentalbike.services.BikeService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/bikes-list")
@RestController
public class BikesController {

    private final BikeService bikeService;
    private final BikeRepository dao;

    public BikesController(BikeService bikeService, BikeRepository dao) {
        this.bikeService = bikeService;
        this.dao = dao;
    }

    @GetMapping
    public List<BikeEntity> list() {return dao.findAll();}

    @GetMapping("/{id}")
    public BikeEntity get(@PathVariable long id) {
        return dao.findById(id).orElse(null);
    }

    @PostMapping
    public String add(@ModelAttribute("bike") @Valid BikeModel model) {

         bikeService.saveBike(model);
         return "success";
    }

}


