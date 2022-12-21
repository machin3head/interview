package com.interview.project.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "states")
public class StateEntity implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String name;

    @NotNull
    private String abbreviation;

    @OneToMany(mappedBy = "state", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SurveyEntity> surveys;

}

//    select * from states;
//    +----+-------------+---------------+
//    | id | name        | abbreviation  |
//    +----+-------------+---------------+
//    | 8  | California  | CA            |
//    | 7  | Colorado    | CO            |
//    | 9  | Ohio        | OH            |
//    +----+-------------+---------------+

