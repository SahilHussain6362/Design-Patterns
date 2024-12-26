package com.example.Toppings;

import com.example.PizzaCrusts.Pizzas;

public class ExtraVegies extends Topping {
    Pizzas Pizza;
    public ExtraVegies(Pizzas Pizza){
        this.Pizza = Pizza;
    }

    public String getPizzaName(){
        return Pizza.getPizzaName() + " ExtraVegeis";
    }

    public int getPizzaPrice(){
        return Pizza.getPizzaPrice() + 20;
    }
}
