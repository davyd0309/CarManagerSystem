package pl.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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
    private String carName;

    @Column(name = "numerSamochodu")
    @Setter
    @Getter
    private String carNumber;

    @Column(name = "stanLicznikaSamochodu")
    @Setter
    @Getter
    private int kmCounter;

    @ManyToMany
    @JoinTable(
            name = "samochody_wlasciciele",
            joinColumns = {@JoinColumn(name = "id_samochodu")},
            inverseJoinColumns = {@JoinColumn(name = "id_wlasciciela")}
    )
    private List<UserBD> carOwnersList = new ArrayList<>();



    @Setter
    @Getter
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "car")
    private List<ExchangeBD> exchangeList = new ArrayList<>();

    @Setter
    @Getter
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "car")
    private List<RefuelingBD> refuelingList = new ArrayList<>();

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

