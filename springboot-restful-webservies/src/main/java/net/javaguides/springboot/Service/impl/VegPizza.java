package net.javaguides.springboot.Service.impl;

import net.javaguides.springboot.Service.PizzaService;

public class VegPizza implements PizzaService {
    @Override
    public String servePizza() {
        return "Veg Pizza is served";
    }
}
