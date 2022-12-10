package com.library122022.getway.repository;

import com.github.javafaker.Faker;
import com.library122022.getway.controller.BookForm;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BooksRepository {

    private final Map<String, BookEntity> bookMap = new HashMap<>();

    public BookEntity add(BookForm bookForm) {
        BookEntity bookEntity = BookEntity.builder()
                .id(new Faker().idNumber().valid())
                .title(bookForm.getTitle())
                .build();

        bookMap.put(bookEntity.getId(), bookEntity);
        return bookEntity;
    }

    public BookEntity get(String id) {
        // TODO - NullPointerException - might return null
        return bookMap.get(id);
    }

    public List<BookEntity> getAll() {
        List<BookEntity> bookList = new ArrayList<>();

        for(Map.Entry<String, BookEntity> entry : bookMap.entrySet()){
            bookList.add(entry.getValue());
        }

        return bookList;
    }
}
