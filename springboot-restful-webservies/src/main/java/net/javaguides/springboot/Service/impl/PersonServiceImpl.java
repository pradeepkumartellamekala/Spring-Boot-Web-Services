package net.javaguides.springboot.Service.impl;

import lombok.RequiredArgsConstructor;
import net.javaguides.springboot.Entity.Person;
import net.javaguides.springboot.Repository.PersonRepository;
import net.javaguides.springboot.Service.PersonService;
import net.javaguides.springboot.dto.PersonDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository pRepo;
    private ModelMapper mm;
    @Override
    public PersonDto create(PersonDto person) {
        Person addPerson = mm.map(person, Person.class);
        Person addedPerson = pRepo.save(addPerson);
        return mm.map(addedPerson, PersonDto.class);
    }

    @Override
    public List<PersonDto> allPersons() {
        List<PersonDto> personsDto = pRepo.findAll().stream().map((person) -> mm.map(person, PersonDto.class)).toList();
         return personsDto;
    }

    @Override
    public PersonDto update(PersonDto person) {
       Person updatePerson = mm.map(person, Person.class);
       Person updatedPerson = pRepo.save(updatePerson);
       return mm.map(updatedPerson, PersonDto.class);
    }

    @Override
    public void del(PersonDto person) {

        Person delPerson = mm.map(person, Person.class);
        pRepo.delete(delPerson);
    }
}
