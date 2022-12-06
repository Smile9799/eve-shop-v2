package com.evecoding.eveshopadmin.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Deal extends DefaultEntity{

    private String dealDescription;
    @OneToOne
    private DealType dealType;
    private BigDecimal dealPercentage;
    private BigDecimal dealAmount;
    private BigDecimal dealCapAmount;
    private BigDecimal dealLimit;

    @OneToMany(mappedBy = "deal")
    private Set<DealProperties> dealProperties = new HashSet<>();
}
