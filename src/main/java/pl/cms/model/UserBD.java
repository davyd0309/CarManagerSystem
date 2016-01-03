package pl.cms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Konrad on 2015-12-19.
 */
@Entity
@Table(name = "Wlasciciele")
public class UserBD {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Integer id;

    @Column(name = "imieWlasciciela")
    @Setter
    @Getter
    private String firstName;

    @Column(name = "nazwiskoWlasciciela")
    @Setter
    @Getter
    private String lastName;

    public UserBD() {
    }

    public UserBD(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
