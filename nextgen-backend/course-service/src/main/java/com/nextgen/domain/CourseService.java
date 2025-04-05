package com.nextgen.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepo courseRepo;

    public CourseResponse get(UUID id) {
        return courseRepo.findById(id)
                .map(CourseMapper::toCourseResponse)
                .orElseThrow();
    }

    public PageResponse<CourseResponse> getCourses(int pageNo) {
        int page = pageNo <= 1 ? 0 : pageNo - 1;
        Pageable pageable = PageRequest.of(page, 10);
        Page<CourseResponse> responsePage = courseRepo.findAll(pageable)
                .map(CourseMapper::toCourseResponse);

        return new PageResponse<>(
                responsePage.getSize(),
                responsePage.getTotalElements(),
                responsePage.getTotalPages(),
                responsePage.isLast(),
                responsePage.getContent()
        );
    }
}
