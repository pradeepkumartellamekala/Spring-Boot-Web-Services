package net.javaguides.springboot.Controller;

import net.javaguides.springboot.Service.PizzaService;

public class PizzaController {
    private PizzaService pizzaService;
    public PizzaController(PizzaService pizzaService){
        this.pizzaService = pizzaService;
    }
    public String orderPizza(){
        return pizzaService.servePizza();
    }
}
