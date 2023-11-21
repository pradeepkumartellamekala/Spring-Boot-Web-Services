package net.javaguides.springboot.Service.impl;

import net.javaguides.springboot.Service.PizzaService;

public class NonVegPizza implements PizzaService {
    @Override
    public String servePizza() {
        return "Non-Veg Pizza is served";
    }
}
