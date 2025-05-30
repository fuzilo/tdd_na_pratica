package br.com.matsumura.TDD_Software.service;

import br.com.matsumura.TDD_Software.domain.Person;
import br.com.matsumura.TDD_Software.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Optional<Person> findById(Long id){
        return personRepository.findById(id);
    }

    public Person create(Person person) {

        return personRepository.save(person);
    }

    public Person update(Long id,Person person) {
        Optional<Person> personOptional = personRepository.findById(id);
        if (personOptional.isPresent()) {
            Person personUpdate = personOptional.get();
            personUpdate.setFirstName(person.getFirstName());
            personUpdate.setLastName(person.getLastName());
            personUpdate.setGender(person.getGender());
            return personRepository.save(personUpdate);
        } else {
            return null;
        }
    }

    public void delete(Person person) {
        personRepository.delete(person);
    }
}

