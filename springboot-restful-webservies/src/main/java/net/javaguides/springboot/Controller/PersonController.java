package net.javaguides.springboot.Controller;

import net.javaguides.springboot.Service.impl.PersonServiceImpl;
import net.javaguides.springboot.dto.PersonDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    private PersonServiceImpl personService;
    public ResponseEntity<PersonDto> createPerson(PersonDto personDto){
        PersonDto createdPerson = personService.create(personDto);
        return new ResponseEntity<>(createdPerson, HttpStatus.OK);
    }

}
