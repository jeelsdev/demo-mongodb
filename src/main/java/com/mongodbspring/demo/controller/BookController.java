package com.mongodbspring.demo.controller;
import com.mongodbspring.demo.model.Book;
import com.mongodbspring.demo.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

// Annotation
@RestController
    public class BookController {

    @Autowired
    private BookRepo repo;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        repo.save(book);

        return "Added Successfully";
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBooks() {

        return repo.findAll();
    }

    @GetMapping("/findBook/{id}")
    public ResponseEntity<Book> getBook(@PathVariable int id) {
        Optional<Book> book = repo.findById(id);
        if (book.isPresent()) {
            return ResponseEntity.ok(book.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping("/addBook")
    public String udpateBook(@RequestBody Book book){
        repo.save(book);

        return "update Successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        repo.deleteById(id);

        return "Deleted Successfully";
    }

}
