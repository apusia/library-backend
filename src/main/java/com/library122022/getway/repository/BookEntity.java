package com.library122022.getway.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
@Entity
public class BookEntity {

    @Id
    private final Long id;
    private final String title;

}
