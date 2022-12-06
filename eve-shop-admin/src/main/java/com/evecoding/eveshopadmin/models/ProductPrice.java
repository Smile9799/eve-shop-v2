package com.evecoding.eveshopadmin.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class ProductPrice extends DefaultEntity{

    private BigDecimal productPrice;
    @OneToOne
    private Product product;
}
