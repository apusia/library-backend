package com.library122022.getway.controller;

import com.library122022.getway.repository.BookEntity;
import com.library122022.getway.repository.BooksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/books")
@RequiredArgsConstructor
public class BooksController {

    private final BooksRepository repository;

    @GetMapping(path = "")
    public List<BookEntity> readBooks() {
        return repository.getAll();
    }

    @GetMapping(path = "/{id}")
    public BookEntity readBook(@PathVariable("id") String id) {
        return repository.get(id);
    }

    @PostMapping(path = ""
//            ,consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public BookEntity createBook(@RequestBody BookForm bookForm) {
        return repository.add(bookForm);
    }
}
