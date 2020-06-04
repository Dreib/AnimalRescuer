package org.fasttrackit;

import java.util.Date;

public class AnimalFood {

    String name;
    double price;
    double quantity;
    Date expirationDate;
    int supply;

    AnimalFood(String name, double price, double quantity, Date expirationDate, int supply) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.supply = supply;
    }

}
