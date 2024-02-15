package com.gitprojects.contentcalendar.controller;

import com.gitprojects.contentcalendar.model.Content;
import com.gitprojects.contentcalendar.repository.ContentCollectionRepository;
import com.gitprojects.contentcalendar.repository.ContentRepository;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
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
//    private ContentCollectionRepository repository;
    private ContentRepository repository;
    public ContentController(ContentRepository repository) {

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
    public void create(@Valid @RequestBody Content content){
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

    /** This method is used to filter the content by title
     * @param keyword
     * @return
     */
    @GetMapping("/filter/{keyword}")
    public List<Content>findByTitle(@PathVariable String keyword){
        return repository.findAllByTitleContains(keyword);
    }


    //Filter for status not working
    @GetMapping("/filter/status/{status}")
    public List<Content>findByStatus(@PathVariable String status){
        return repository.listByStatus(status);
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
