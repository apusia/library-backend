package com.library122022.getway.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface BooksRepository extends JpaRepository<BookEntity, Long> {
//    BookEntity findByName(String productName);
}
