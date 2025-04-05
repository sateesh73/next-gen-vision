package com.nextgen.domain;

import org.springframework.stereotype.Service;

@Service
public class CourseMapper {
    public static CourseResponse toCourseResponse(CourseEntity courseEntity) {
        return CourseResponse.builder()
                .id(courseEntity.getId())
                .title(courseEntity.getTitle())
                .price(courseEntity.getPrice())
                .description(courseEntity.getDescription())
                .difficultyLevel(courseEntity.getDifficultyLevel())
                .durationHours(courseEntity.getDurationHours())
                .topics(courseEntity.getTopics())
                .published(courseEntity.isPublished())
                .updatedAt(courseEntity.getUpdatedAt())
                .createdAt(courseEntity.getCreatedAt())
                .build();
    }
}
