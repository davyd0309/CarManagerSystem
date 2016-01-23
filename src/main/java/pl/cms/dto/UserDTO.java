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

    public UserDTO() {
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
