package com.evecoding.eveshopadmin.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.ZonedDateTime;

@MappedSuperclass
@Getter
@Setter
public class DefaultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected ZonedDateTime createdAt;
    protected ZonedDateTime updatedAt;
    protected boolean isActive;
    protected ZonedDateTime effectiveDate;
    protected ZonedDateTime expiryDate;
}
