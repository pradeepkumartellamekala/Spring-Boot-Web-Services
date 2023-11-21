package net.javaguides.springboot.Service;

import net.javaguides.springboot.dto.PersonDto;
import java.util.*;

public interface PersonService {
    PersonDto create(PersonDto person);
    List<PersonDto> allPersons();
    PersonDto update(PersonDto person);
    void del(PersonDto person);
}
