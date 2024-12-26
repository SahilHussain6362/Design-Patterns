package com.example;

import com.example.PizzaCrusts.Classic;
import com.example.PizzaCrusts.Margharita;
import com.example.PizzaCrusts.Pizzas;
import com.example.Toppings.ExtraCheese;
import com.example.Toppings.ExtraVegies;

public class Main {
    public static void main(String[] args) {
        Pizzas pizza1 = new Classic();
        pizza1 = new ExtraCheese(pizza1);
        pizza1 = new ExtraVegies(pizza1);
        System.out.print(pizza1.getPizzaName() + " : ");
        System.out.println(pizza1.getPizzaPrice() + ".");

        Pizzas pizza2 = new Margharita();
        pizza2 = new ExtraCheese(pizza2);
        System.out.print(pizza2.getPizzaName() + " : ");
        System.out.print(pizza2.getPizzaPrice() + ".");
    }
}