package pl.cms.dto;


import pl.cms.model.UserBD;

import java.util.function.BiConsumer;

/**
 * Created by Konrad on 2016-02-19.
 */
public interface Converter {

    BiConsumer<UserBD, UserDTO> convertUserDtoToUserBd = ((userBD, userDTO) -> {
        userBD.setFirstName(userDTO.getFirstName());
        userBD.setLastName(userDTO.getLastName());

    });


}
