package com.nextgen.web;

import com.nextgen.domain.CourseResponse;
import com.nextgen.domain.CourseService;
import com.nextgen.domain.PageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/course")
@RequiredArgsConstructor
class CourseController {

    private final CourseService courseService;

    @GetMapping
    ResponseEntity<PageResponse<CourseResponse>> get(@RequestParam(name = "page", defaultValue = "1") int page) {
        return new ResponseEntity<>(courseService.getCourses(page), HttpStatus.OK);
    }

    @GetMapping("{id}")
    ResponseEntity<CourseResponse> getOne(@PathVariable UUID id) {
        return new ResponseEntity<>(courseService.get(id), HttpStatus.OK);
    }
}
