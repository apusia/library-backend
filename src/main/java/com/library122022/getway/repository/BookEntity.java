package com.library122022.getway.repository;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class BookEntity {

    private final String title;
    private final String id;

}
