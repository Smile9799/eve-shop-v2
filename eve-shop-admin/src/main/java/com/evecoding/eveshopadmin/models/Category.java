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
public class Category extends DefaultEntity{

    private String categoryName;
    private String categoryDepartment;

    @OneToMany(mappedBy = "category")
    private Set<ItemImage> images = new HashSet<>();
    @OneToMany(mappedBy = "category")
    private Set<Product> products = new HashSet<>();
}
