package net.javaguides.springboot.Controller;

import net.javaguides.springboot.Service.CarnivorousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatsController {
    private CarnivorousService carniService;

    @Autowired
    public CatsController(CarnivorousService carni){
        this.carniService = carni;
    }

    public String carnivorousEats(){
        return carniService.eatsDeer();
    }
}
