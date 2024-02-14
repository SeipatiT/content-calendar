package com.gitprojects.contentcalendar.controller;

import com.gitprojects.contentcalendar.model.Content;
import com.gitprojects.contentcalendar.repository.ContentCollectionRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/content")
//@CrossOrigin
@CrossOrigin(origins = "*")
public class ContentController {
    private ContentCollectionRepository repository;
    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }

    //make a request to the server to get all the content
    @GetMapping("")
    public List<Content> findAll(){
        return repository.findAll();
    }

    //make a request to the server to get a specific content
    @GetMapping("/{id}")
    public Content findById(@PathVariable Integer id){
        return repository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Content not found"));
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@RequestBody Content content){
            repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Content content, @PathVariable Integer id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Content not found");
        }   repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping ("/{id}")
    public void delete(@PathVariable Integer id){
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Content not found");
        }
        repository.deleteById(id);
    }

//    @PostConstruct
//    private void init(){
//        Content c = new Content(1,
//                "First Post",
//                "This is my first blog post",
//                "IDEA",
//                "ARTICLE",
//                "http://www.google.com");
//        repository.save(c);
//}

}
