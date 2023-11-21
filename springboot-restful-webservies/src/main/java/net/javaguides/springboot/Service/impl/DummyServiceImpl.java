package net.javaguides.springboot.Service.impl;

import net.javaguides.springboot.Service.DummyService;
import org.springframework.stereotype.Service;

@Service
public class DummyServiceImpl implements DummyService {
    @Override
    public String dummyMethod() {
        return "This is from Dummy service";
    }
}
