package net.javaguides.springboot;

import net.javaguides.springboot.Controller.CatsController;
import net.javaguides.springboot.Controller.DummyController;
import net.javaguides.springboot.Controller.PizzaController;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootRestfulWebserviesApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringbootRestfulWebserviesApplication.class, args);
		PizzaController pizzaCtrl = appContext.getBean("pizzaController", PizzaController.class);
		System.out.println(pizzaCtrl.orderPizza());
	}

}
