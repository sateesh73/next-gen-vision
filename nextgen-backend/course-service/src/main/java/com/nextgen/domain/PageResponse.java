package com.nextgen.domain;

import lombok.AllArgsConstructor;

import java.util.List;

public record PageResponse<T>(
        int pageSize,
        long totalElements,
        int totalPages,
        boolean last,
        List<T> content
) {
}
