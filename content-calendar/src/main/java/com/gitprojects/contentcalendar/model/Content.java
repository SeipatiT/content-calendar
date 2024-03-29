package com.gitprojects.contentcalendar.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import java.sql.Statement;
import java.time.LocalDateTime;


public record Content(
        @Id
       Integer id,
       @NotBlank
       String title,
       String desc,
       Status status,
       Type contentType,

       LocalDateTime dateCreated,
       LocalDateTime dateUpdated,
       String url


) {
}
