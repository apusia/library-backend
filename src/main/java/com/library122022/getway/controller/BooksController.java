package com.library122022.getway.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.library122022.getway.configuration.JsonObjectMapper;
import com.library122022.getway.repository.BookEntity;
import com.library122022.getway.repository.BooksRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
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

    @GetMapping()
//    @GetMapping(path = "")
//    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<BookEntity> readBooks() {
        return repository.findAll();
    }

    @GetMapping(path = "/{id}")
    public BookEntity readBook(@PathVariable("id") Long id) {
        return repository.findById(id).get();
    }

    @SneakyThrows
    @PostMapping(path = ""
//            ,consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE}
    )
//    public BookEntity createBook(@RequestBody BookForm bookForm) {
    public BookEntity createBook(@RequestBody String bookFormString) {
        BookForm bookForm = JsonObjectMapper.jsonObjectMapper().readValue(bookFormString, BookForm.class);

        BookEntity bookEntity = BookEntity.builder()
                .title(bookForm.getTitle())
                .build();

        return repository.save(bookEntity);
    }
}
