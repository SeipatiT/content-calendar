package com.gitprojects.contentcalendar.repository;

import com.gitprojects.contentcalendar.model.Content;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
    List<Content> findAllByTitleContains(String keyword);

    @Query("""
            SELECT * FROM content
            WHERE status EQUALS :status
            """)
    List<Content> listByStatus(@Param("status") String status);
}
