package com.evecoding.eveshopadmin.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
public class DealType extends DefaultEntity{

    private String dealType;
    @OneToOne
    private Deal deal;
}
