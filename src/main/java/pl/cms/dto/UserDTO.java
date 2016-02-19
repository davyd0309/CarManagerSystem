package pl.cms.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Konrad on 2016-01-23.
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
    private String login;

    public UserDTO() {
    }


}
