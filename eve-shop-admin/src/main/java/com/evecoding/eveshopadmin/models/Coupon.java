package com.evecoding.eveshopadmin.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Coupon extends DefaultEntity{

    private BigDecimal couponAmountValue;
    private BigDecimal couponPercentageValue;
    private BigDecimal couponCapAmount;
    private String description;
    private boolean isRedeemed;
    private String couponSerialNumber;
}
