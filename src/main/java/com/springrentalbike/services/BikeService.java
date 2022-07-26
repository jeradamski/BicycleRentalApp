package com.springrentalbike.services;

import com.springrentalbike.dao.BikeRepository;
import com.springrentalbike.mappers.BikeMapper;
import com.springrentalbike.entities.BikeEntity;
import com.springrentalbike.models.BikeModel;
import org.springframework.stereotype.Service;

@Service
public class BikeService {

    private final BikeRepository bikeRepository;

    public BikeService(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    public void saveBike(BikeModel model) {
        BikeEntity bikeEntity = BikeMapper.toEntity(model);
        bikeRepository.save(bikeEntity);
    }

}
