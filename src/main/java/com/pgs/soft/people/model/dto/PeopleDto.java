package com.pgs.soft.people.model.dto;

import lombok.*;

/**
 * Created by lukasz on 3/6/17.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PeopleDto {
    private String name;
    private String surname;
    private Integer age;
}