package pl.cms.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Konrad Dawydiuk on 23.04.2016.
 */
public class InformationDTO {


    @Setter
    @Getter
    private String carName;

    @Setter
    @Getter
    private Date dateInfo;

    @Setter
    @Getter
    private String exchange;

    @Setter
    @Getter
    private String refueling;

    @Setter
    @Getter
    private BigDecimal price;





}
