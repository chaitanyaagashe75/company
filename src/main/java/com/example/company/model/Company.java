package com.example.company.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Company  {
    @Id
    private int id;
    private String name;
    private String turnover;

    public Company(int id, String name, String turnover) {
        this.id = id;
        this.name = name;
        this.turnover = turnover;
    }
}
