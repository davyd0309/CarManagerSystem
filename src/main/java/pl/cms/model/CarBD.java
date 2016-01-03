package pl.cms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    private int carNumber;

    @Column(name = "stanLicznikaSamochodu")
    @Setter
    @Getter
    private int kmCounter;

    @OneToMany
    @JoinColumn(name = "wlascicielSamochoduId")
    @Setter
    @Getter
    private List<UserBD> carOwnerslist;

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
                ", carOwnerslist=" + carOwnerslist +
                ", exchangeBDList=" + exchangeBDList +
                ", refuelingBDList=" + refuelingBDList +
                '}';
    }
}

