package com.springrentalbike.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "bikes")
public class BikeEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String model;

    private String size;

    private String type;

    private BigDecimal rentalPrice;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getRentalPrice() {
        return rentalPrice;
    }
}
