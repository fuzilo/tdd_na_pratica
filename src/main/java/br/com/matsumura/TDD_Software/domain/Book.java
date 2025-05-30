package br.com.matsumura.TDD_Software.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Data
@Entity(name = "tb_book")
@Getter
@Service
public class Book {

    private static final long generationType = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", nullable = false, length = 80)
    private String title;
    @Column(name = "author", nullable = false, length = 80)
    private String author;
    @Column(name = "pages", nullable = false, length = 80)
    private int pages;


    public Book() {
    }

    public Book(Long id, String title, String author, int pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author, int pages) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
