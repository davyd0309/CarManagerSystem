package pl.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Konrad on 2015-12-19.
 */
@Entity
@Table(name = "Samochody")
public class CarBD {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Integer id;

    @Column(name = "nazwaSamochodu")
    @Setter
    @Getter
    @NotNull
    @Size(min = 3,max = 30)
    private String carName;

    @Column(name = "numerSamochodu")
    @Setter
    @Getter
    @NotNull
    private String carNumber;

    @Column(name = "stanLicznikaSamochodu")
    @Setter
    @Getter
    @NotNull
    private int kmCounter;

    @ManyToMany
    @JoinTable(
            name = "samochody_wlasciciele",
            joinColumns = {@JoinColumn(name = "id_samochodu")},
            inverseJoinColumns = {@JoinColumn(name = "id_wlasciciela")}
    )
    private List<UserBD> carOwnersList = new ArrayList<>();



    public CarBD() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", carNumber=" + carNumber +
                ", kmCounter=" + kmCounter +
                ", carOwnersList=" + carOwnersList +

                '}';
    }
}

