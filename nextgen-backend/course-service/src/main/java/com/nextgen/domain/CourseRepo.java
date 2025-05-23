package com.nextgen.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
interface CourseRepo extends JpaRepository<CourseEntity, UUID> {
}
