package pl.cms.dto;

import lombok.Getter;
import lombok.Setter;
import pl.cms.model.CarBD;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Konrad on 2015-12-19.
 */

public class UserDTO {


    @Setter
    @Getter
    private Integer id;


    @Setter
    @Getter
    private String firstName;


    @Setter
    @Getter
    private String lastName;



    @Setter
    @Getter
    private String email;



    public UserDTO() {
    }




}
