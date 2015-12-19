package pl.cms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Judytka on 2015-12-19.
 */

public class Exchange {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Integer Id;

    @Setter
    @Getter
    private Date exchangeDate;


    @Setter
    @Getter
    private String exchangeDescription;

    @Setter
    @Getter
    private Enum exchangePlace;



}
