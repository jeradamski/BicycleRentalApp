package com.springrentalbike.mappers;

import com.springrentalbike.models.OrderEntity;
import com.springrentalbike.models.OrderModel;

public class OrderMapper {

    public static OrderEntity toEntity(OrderModel model) {
        OrderEntity entity = new OrderEntity();
        entity.setRentalCost(model.getRentalCost());
        entity.setRentalStartingDate(model.getRentalStartingDate());
        entity.setRentalEndDate(model.getRentalEndDate());

        return entity;
    }


}
