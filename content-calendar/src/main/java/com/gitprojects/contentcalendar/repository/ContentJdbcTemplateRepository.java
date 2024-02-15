package com.gitprojects.contentcalendar.repository;

import com.gitprojects.contentcalendar.model.Content;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//@Repository
public class ContentJdbcTemplateRepository {

    private final JdbcTemplate jdbcTemplate;

    public ContentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    private static Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//        return new Content(rs.getInt(columnLabel: "id"),
//                rs.getString(columnLabel: "title"),
//                rs.getString(columnLabel: "desc"),
//                Status.valueOf(rs.getString(columnLabel: "status")),
//                Type.valueOf(rs.getString(columnLabel: "content_type")),
//                rs.getTimestamp(columnLabel: "date_created").toLocalDateTime(),
//                rs.getTimestamp(columnLabel: "date_updated").toLocalDateTime(),
//                rs.getString(columnLabel: "url"));
//    }
//
//    public List<Content> getAllContent() {
//        String sql = "SELECT * FROM Content";
//        List<Content> contents = jdbcTemplate.query(sql, ContentJdbcTemplateRepository::mapRow);
//        return contents;
//    }
//
//    public void createContent(String title, String desc, String status, String contentType, String url) {
//        String sql = "INSERT INTO Content (title, desc, status, content_type, url) VALUES (?, ?, ?, ?, ?)";
//        jdbcTemplate.update(sql, title, desc, status, contentType, url);
//    }
//
//    public void updateContent(int id, String title, String desc, String status, String contentType, String url) {
//        String sql = "UPDATE Content SET title = ?, desc = ?, status = ?, content_type = ?, url = ? WHERE id = ?";
//        jdbcTemplate.update(sql, title, desc, status, contentType, url, id);
//    }
//
//    public void deleteContent(int id) {
//        String sql = "DELETE FROM Content WHERE id = ?";
//        jdbcTemplate.update(sql, id);
//    }
//
//    public Content getContentById(int id) {
//        String sql = "SELECT * FROM Content WHERE id = ?";
//        Content content =  jdbcTemplate.queryForObject(sql, new Object[]{id}, ContentJdbcTemplateRepository::mapRow);
//        return content;
//    }
}
