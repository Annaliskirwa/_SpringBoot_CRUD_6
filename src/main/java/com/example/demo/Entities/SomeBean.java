package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@JsonFilter("SomeBeanFilter")
//@JsonIgnoreProperties(value={"field1"})
public class SomeBean {
    private String field1;
    private String field2;
//    @JsonIgnore
    private String field3;
}
