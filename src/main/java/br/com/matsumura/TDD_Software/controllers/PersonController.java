package br.com.matsumura.TDD_Software.controllers;

import br.com.matsumura.TDD_Software.domain.Person;
import br.com.matsumura.TDD_Software.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll(){
        return personService.findAll();
    }


    @GetMapping(value = "/{id}")
    public Person findById(@PathVariable (value = "id") Long id
    ){
        return personService.findById(id).orElse(null);
    }

    @PostMapping()
    public Person create(@RequestBody Person person){
        return personService.create(person);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
    public Person update(
            @PathVariable(value = "id") Long id,
            @RequestBody Person person){
        return personService.update(id, person);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") Long id){
         personService.delete(id);
    }
}
