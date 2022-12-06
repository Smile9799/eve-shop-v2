package com.evecoding.eveshopadmin.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Department extends DefaultEntity{

    private String departmentName;
    private String departmentDescription;

    @OneToMany(mappedBy = "department")
    private Set<Product> products = new HashSet<>();

    @OneToMany(mappedBy = "department")
    private Set<DealProperties> dealProperties = new HashSet<>();
}
