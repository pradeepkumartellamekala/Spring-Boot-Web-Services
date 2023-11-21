package net.javaguides.springboot.Config;

import net.javaguides.springboot.Controller.PizzaController;
import net.javaguides.springboot.Service.CarnivorousService;
import net.javaguides.springboot.Service.PizzaService;
import net.javaguides.springboot.Service.impl.NonVegPizza;
import net.javaguides.springboot.Service.impl.TigerService;
import net.javaguides.springboot.Service.impl.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "tigerServiceBean")
    public CarnivorousService tigerService(){
        return new TigerService();
    }

    @Bean
    public PizzaService vegPizza(){
        return new VegPizza();
    }

    @Bean
    public PizzaService nonVegPizza(){
        return new NonVegPizza();
    }

    @Bean
    public PizzaController pizzaController(){
        return new PizzaController(vegPizza());
    }


}
