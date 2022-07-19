package com.springrentalbike.services;

import com.springrentalbike.dao.BikeRepository;
import com.springrentalbike.dao.OrderRepository;
import com.springrentalbike.mappers.ClientMapper;
import com.springrentalbike.mappers.OrderMapper;
import com.springrentalbike.models.*;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.math.BigDecimal;
import java.util.Date;

@Service
public class OrderService {

    private final BikeRepository bikeRepository;
    private final OrderRepository orderRepository;

    public OrderService(BikeRepository bikeRepository, OrderRepository orderRepository) {
        this.bikeRepository = bikeRepository;
        this.orderRepository = orderRepository;
    }

    public void saveRent(Long bikeId,
                         OrderModel orderModel,
                         ClientModel clientModel) {

        BikeEntity bikeEntity = bikeRepository.findById(bikeId).orElseThrow(EntityNotFoundException::new);

        ClientEntity clientEntity = ClientMapper.toEntity(clientModel);

        OrderEntity orderEntity = OrderMapper.toEntity(orderModel);
        orderEntity.setBike(bikeEntity);
        orderEntity.setClient(clientEntity);
        orderRepository.save(orderEntity);

    }

}

