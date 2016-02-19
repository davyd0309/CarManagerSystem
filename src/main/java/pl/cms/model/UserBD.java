package pl.cms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Konrad on 2015-12-19.
 */
@Entity
@Table(name = "Wlasciciele")
public class UserBD implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Integer id;

    @Column(name = "imieWlasciciela")
    @Setter
    @Getter
    @NotNull
    private String firstName;

    @Column(name = "nazwiskoWlasciciela")
    @Setter
    @Getter
    @NotNull
    private String lastName;

    @Column(name = "loginWlasciciela")
    @Setter
    @Getter
    @NotNull
    private String login;

    @ManyToMany(mappedBy = "carOwnersList")
    @Setter
    @Getter
    private List<CarBD> carList = new ArrayList<>();

    public UserBD() {
    }

    public UserBD(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
