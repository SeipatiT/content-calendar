package com.gitprojects.contentcalendar.repository;

import com.gitprojects.contentcalendar.model.Content;
import com.gitprojects.contentcalendar.model.Status;
import com.gitprojects.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository(){

    }

    public List<Content> findAll(){
        return contentList;
    }

    public void save(Content content){
        contentList.add(content);
    }

    public Optional<Content>findById(Integer id){
        return contentList.stream().filter(c -> c.id().equals(id)).
                findFirst();}


  @PostConstruct
    private void init(){
        Content content = new Content(1,
              "First Post",
              "This is my first blog post",
              Status.IDEA,
              Type.ARTICLE,
              LocalDateTime.now(),
              null,
              "http://www.google.com");
        contentList.add(content);
    }


    }
