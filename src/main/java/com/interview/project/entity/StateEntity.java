package com.interview.project.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "states")
public class StateEntity implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SurveyEntity> surveys;

    private String name;
}

//    select * from surveys;
//    +----+-----------+-----------------------------+
//    | id | state_id  | name                        |
//    +----+-----------+-----------------------------+
//    | 1  | 9         | Municipal Demographics 2022 |
//    | 2  | 9         | Metropolitan Parks 1996     |
//    | 3  | 8         | Land Appreciation 2017      |
//    | 4  | 7         | Metropolitan Parks 2022     |
//    +----+-----------+-----------------------------+
//
//    select * from states;
//    +----+-------------+---------------+
//    | id | name        | abbreviation  |
//    +----+-------------+---------------+
//    | 8  | California  | CA            |
//    | 7  | Texas       | TX            |
//    | 9  | Ohio        | OH            |
//    +----+-------------+---------------+
//
//
//    TODO write query to generate below result
//
//    +----------+-------------------+
//    | state_id | number_of_surveys |
//    +----------+-------------------+
//    | 9        | 2                 |
//    | 8        | 1                 |
//    | 7        | 1                 |
//    +----------+-------------------+
//
//    TODO write query to generate below result
//
//    +-------------+-------------------+
//    | state       | number_of_surveys |
//    +-------------+-------------------+
//    | Ohio        | 2                 |
//    | California  | 1                 |
//    | Texas       | 1                 |
//    +-------------+-------------------+
