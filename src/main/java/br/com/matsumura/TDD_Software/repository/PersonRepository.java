package br.com.matsumura.TDD_Software.repository;

import br.com.matsumura.TDD_Software.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {


}
