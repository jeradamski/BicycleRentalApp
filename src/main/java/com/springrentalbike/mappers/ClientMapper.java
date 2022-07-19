package com.springrentalbike.mappers;

import com.springrentalbike.models.ClientEntity;
import com.springrentalbike.models.ClientModel;

public class ClientMapper {

    public static ClientEntity toEntity(ClientModel model) {
        ClientEntity entity = new ClientEntity();
        entity.setFirstName(model.getFirstName());
        entity.setLastName(model.getLastName());
        entity.setStreet(model.getStreet());
        entity.setHouseAndApartmentNumber(model.getHouseAndApartmentNumber());
        entity.setPostalCode(model.getPostalCode());
        entity.setCity(model.getCity());
        entity.setPhone(model.getPhone());
        entity.setEmailAddress(model.getEmailAddress());

        return entity;
    }

}
