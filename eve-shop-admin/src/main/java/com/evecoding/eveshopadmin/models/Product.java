package com.evecoding.eveshopadmin.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Product extends DefaultEntity{

    @Lob
    private String productName;
    @Lob
    private String productDescription;
    private String dimension;
    private String parentId;
    private String productId;
    private boolean isSerialized;
    private BigDecimal defaultAmount;
    @ManyToOne
    private Department department;
    @ManyToOne
    private Category category;
    @OneToOne
    private ProductPrice productPrice;
    @OneToMany(mappedBy = "product")
    private Set<ItemImage> itemImages = new HashSet<>();
    @OneToMany(mappedBy = "product")
    private Set<DealProperties> dealProperties = new HashSet<>();
}
