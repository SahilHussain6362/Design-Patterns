package com.example.Toppings;

import com.example.PizzaCrusts.Pizzas;

public class ExtraCheese extends Topping {
    Pizzas Pizza;
    public ExtraCheese(Pizzas Pizza){
        this.Pizza = Pizza;
    }

    public String getPizzaName(){
        return Pizza.getPizzaName() + " ExtraChesse";
    }

    public int getPizzaPrice(){
        return Pizza.getPizzaPrice() + 20;
    }
}
