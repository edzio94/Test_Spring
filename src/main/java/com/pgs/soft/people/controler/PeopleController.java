package com.pgs.soft.people.controler;

import com.pgs.soft.people.model.dto.PeopleDto;
import com.pgs.soft.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lukasz on 3/6/17.
 */
@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleDto peopleDto;
    @Autowired
    private PeopleService peopleService;

    @GetMapping
    public void getPeople() {
        PeopleDto.builder()
                .age(11)
                .name("Damian")
                .surname("Damian1")
                .build();
    }

    @GetMapping("/test/{name}")
    public PeopleDto getName(@PathVariable String name){
        PeopleDto damian1 = PeopleDto.builder()
                .age(11)
                .name(name)
                .surname("Damian1")
                .build();
        return peopleService.save(damian1);
    }

    @GetMapping("/xxx")
    public PeopleDto test(){
        return peopleDto;
    }
}
