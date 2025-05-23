package br.com.matsumura.TDD_Software.service;

import br.com.matsumura.TDD_Software.domain.Person;
import br.com.matsumura.TDD_Software.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }


}

