package br.com.matsumura.TDD_Software.controllers;

import br.com.matsumura.TDD_Software.dto.BookDTO;
import br.com.matsumura.TDD_Software.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> getBook(@PathVariable Long id){
        return ResponseEntity.ok().body(bookService.findBook(id));
    }
    @GetMapping
    public ResponseEntity<List<BookDTO>> getAllBooks(){
        List<BookDTO> list = bookService.findAllBooks();
        return ResponseEntity.ok().body(list);
    }
    @PostMapping
    public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO bookDTO){
        bookService.createBook(bookDTO);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<BookDTO> updateBook(@PathVariable Long  id, @RequestBody BookDTO bookDTO){
        bookService.updateBook(id, bookDTO);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<BookDTO> deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }
}
