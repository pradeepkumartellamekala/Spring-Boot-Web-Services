package net.javaguides.springboot.Controller;

import net.javaguides.springboot.Service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
    private DummyService dummyService;

    @Autowired
    public DummyController(DummyService dummy){
        this.dummyService = dummy;
    }

    public String dummyString(){
        return dummyService.dummyMethod();
    }
}
