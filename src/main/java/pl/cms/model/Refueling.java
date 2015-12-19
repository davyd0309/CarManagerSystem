package pl.cms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Judytka on 2015-12-19.
 */

public class Refueling {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Integer Id;

    @Setter
    @Getter
    private Date refuelingDate;

    @Setter
    @Getter
    private BigDecimal refuelingPrice;

    @Setter
    @Getter
    private Enum refuelingPlace;

    @Setter
    @Getter
    private Car car;
}
