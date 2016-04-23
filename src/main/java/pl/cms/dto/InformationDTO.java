package pl.cms.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Created by Konrad Dawydiuk on 23.04.2016.
 */
public class InformationDTO {


    @Setter
    @Getter
    private String carName;

    @Setter
    @Getter
    private String exchange;

    @Setter
    @Getter
    private String refueling;



}
