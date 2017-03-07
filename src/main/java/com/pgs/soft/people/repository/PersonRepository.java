package com.pgs.soft.people.repository;

import com.pgs.soft.people.model.entity.People;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lukasz on 3/6/17.
 */
@Repository
public interface PersonRepository extends CrudRepository<People,Integer> {
    List<People> findBySurname(String surname);

}
