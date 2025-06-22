package com.github.kmu_wink.common.api;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@Data
@RequiredArgsConstructor
public class ApiResponse<T> {

    private final boolean success;
    private final String message;
    private final T content;

    public static <T> ApiResponse<T> ok() {

        return ok(null);
    }

    public static <T> ApiResponse<T> ok(T content) {

        return new ApiResponse<>(true, null, content);
    }

    public static ApiResponse<Map<String, String>> error(String message) {

        return new ApiResponse<>(false, message, null);
    }
}
