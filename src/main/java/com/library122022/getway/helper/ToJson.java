package com.library122022.getway.helper;

import com.library122022.getway.configuration.JsonObjectMapper;
import lombok.SneakyThrows;

public interface ToJson {
    @SneakyThrows
    default String toJson() {
        return JsonObjectMapper.jsonObjectMapper().writeValueAsString(this);
    }
}
