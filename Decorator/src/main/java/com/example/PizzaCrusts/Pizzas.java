package com.example.PizzaCrusts;

public abstract class Pizzas {
    String pizzaName = "";

    public String getPizzaName() {
        return pizzaName;
    }

    public abstract int getPizzaPrice();
}
