package com.pgs.soft.people.service;

import com.pgs.soft.people.model.dto.PeopleDto;
import com.pgs.soft.people.model.entity.People;
import com.pgs.soft.people.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lukasz on 3/6/17.
 */
@Service
public class PeopleService {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    private ModelMapper mapper;

    public PeopleDto save(PeopleDto peopleDto) {
        People map = mapper.map(peopleDto, People.class);
        People save = personRepository.save(map);
        return mapper.map(save, PeopleDto.class);
    }
}
