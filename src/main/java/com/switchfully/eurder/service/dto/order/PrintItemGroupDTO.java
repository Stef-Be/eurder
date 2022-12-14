package com.switchfully.eurder.service.dto.order;

import java.time.LocalDate;

public class PrintItemGroupDTO {
    private String itemId;
    private int amount;
    private LocalDate shippingDate;

    public PrintItemGroupDTO setItemId(String itemId){
        this.itemId = itemId;
        return this;
    }
    public PrintItemGroupDTO setAmount(int amount){
        this.amount = amount;
        return this;
    }
    public PrintItemGroupDTO setShippingDate(LocalDate shippingDate){
        this.shippingDate = shippingDate;
        return this;
    }

    public String getItemId() {
        return itemId;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }
}
