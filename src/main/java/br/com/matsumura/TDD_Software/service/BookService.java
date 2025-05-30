package br.com.matsumura.TDD_Software.service;

import br.com.matsumura.TDD_Software.domain.Book;
import br.com.matsumura.TDD_Software.dto.BookDTO;
import br.com.matsumura.TDD_Software.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBook(BookDTO bookDTO){

        Book book = new Book();
        book.setTitle(bookDTO.title());
        book.setAuthor(bookDTO.author());
        book.setPages(bookDTO.pages());

        bookRepository.save(book);
    }
    public void deleteBook(Long  id){
        if (!bookRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        bookRepository.deleteById(id);
    }
    public void updateBook(Long id, BookDTO bookDTO){
        Book bookToUpdate = findBookById(id);
        bookToUpdate.setTitle(bookDTO.title());
        bookToUpdate.setAuthor(bookDTO.author());
        bookToUpdate.setPages(bookDTO.pages());
        bookRepository.save(bookToUpdate);
    }

    public Book findBookById(Long  id){
        return bookRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public BookDTO findBook(Long id){
        Book book = findBookById(id);
        return new BookDTO(book.getTitle(), book.getAuthor(), book.getPages());
    }

    public List<BookDTO> findAllBooks(){

            return bookRepository.findAll()
                    .stream()
                    .map(book -> new BookDTO(
                            book.getTitle(),
                            book.getAuthor(),
                            book.getPages())
                    )
                    .toList();
    }


}
