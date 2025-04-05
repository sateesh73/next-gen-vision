package com.nextgen.domain;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Builder
public record CourseResponse(
        UUID id,
        String title,
        String description,
        List<String> topics,
        BigDecimal price,
        Integer durationHours,
        Level difficultyLevel,
        boolean published,
        Instant createdAt,
        Instant updatedAt
) {
}
