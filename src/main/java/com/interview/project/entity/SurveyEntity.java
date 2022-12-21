package com.interview.project.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "surveys")
public class SurveyEntity implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String name;

    @NotNull
    @JoinColumn(name = "state_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private StateEntity state;

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
