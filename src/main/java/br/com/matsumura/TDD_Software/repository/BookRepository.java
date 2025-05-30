package br.com.matsumura.TDD_Software.repository;

import br.com.matsumura.TDD_Software.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

        Optional<Book> findById(long id);
}
