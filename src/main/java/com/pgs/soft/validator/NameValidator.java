package com.pgs.soft.validator;

import com.pgs.soft.people.model.dto.PeopleDto;
import com.pgs.soft.people.model.entity.People;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by lukasz on 3/6/17.
 */
@Component
public class NameValidator {

    @Bean
    public PeopleDto getPerson() {
        return PeopleDto.builder()
                .age(99)
                .name("test")
                .surname("test")
                .build();
    }
}
