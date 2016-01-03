package pl.cms.model;

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
public class CarBD implements Serializable{

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
    @Setter
    @Getter
    private List<UserBD> carOwnersList = new ArrayList<>();

    @OneToMany(mappedBy = "carBDId")
    @Setter
    @Getter
    private List<ExchangeBD> exchangeBDList;

    @OneToMany(mappedBy = "carBDId")
    @Setter
    @Getter
    private List<RefuelingBD> refuelingBDList;


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
                ", exchangeBDList=" + exchangeBDList +
                ", refuelingBDList=" + refuelingBDList +
                '}';
    }
}

