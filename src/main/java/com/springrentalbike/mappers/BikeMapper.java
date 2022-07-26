package com.springrentalbike.mappers;

import com.springrentalbike.entities.BikeEntity;
import com.springrentalbike.models.BikeModel;

public class BikeMapper {

    public static BikeEntity toEntity(BikeModel model) {
        BikeEntity entity = new BikeEntity();
        entity.setModel(model.getModel());
        entity.setName(model.getName());
        entity.setRentalPrice(model.getRentalPrice());
        entity.setSize(model.getSize());
        entity.setType(model.getType());

        return entity;

    }

}
