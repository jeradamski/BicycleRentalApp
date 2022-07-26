package com.springrentalbike.entities;

import com.springrentalbike.entities.BikeEntity;
import com.springrentalbike.entities.ClientEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue
    private Long id;
    private BigDecimal rentalCost;
    private Date rentalStartingDate;
    private Date rentalEndDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private ClientEntity client;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bike_id")
    private BikeEntity bike;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(BigDecimal rentalCost) {
        this.rentalCost = rentalCost;
    }

    public Date getRentalStartingDate() {
        return rentalStartingDate;
    }

    public void setRentalStartingDate(Date rentalStartingDate) {
        this.rentalStartingDate = rentalStartingDate;
    }

    public Date getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(Date rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public BikeEntity getBike() {
        return bike;
    }

    public void setBike(BikeEntity bike) {
        this.bike = bike;
    }
}
