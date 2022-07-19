package com.springrentalbike.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class OrderModel {

    private BigDecimal rentalCost;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date rentalStartingDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date rentalEndDate;

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
}
