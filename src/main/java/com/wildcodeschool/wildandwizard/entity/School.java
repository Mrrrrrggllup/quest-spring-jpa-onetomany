package com.wildcodeschool.wildandwizard.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long capacity;
    private String country;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Wizard> wizards;

    public School() {
    }
}