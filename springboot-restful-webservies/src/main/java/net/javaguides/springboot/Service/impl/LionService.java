package net.javaguides.springboot.Service.impl;

import net.javaguides.springboot.Service.CarnivorousService;
import org.springframework.stereotype.Service;

@Service
public class LionService implements CarnivorousService {
    @Override
    public String eatsDeer() {
        return "Lion eats Deer";
    }
}
