package net.javaguides.springboot.Service.impl;

import net.javaguides.springboot.Service.CarnivorousService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class TigerService implements CarnivorousService {
    @Override
    public String eatsDeer() {
        return "Tiger eats Deer";
    }
}
