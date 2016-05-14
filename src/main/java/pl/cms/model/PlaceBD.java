package pl.cms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Konrad on 06.01.2016.
 */
@Entity
@Table(name = "Miejsca")
public class PlaceBD  {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Integer id;

    @Column(name = "nazwaMiejsca")
    @Setter
    @Getter
    private String name;

    @Column(name = "adresMiejsca")
    @Setter
    @Getter
    private String address;

    @Column(name = "iloscPunktow")
    @Setter
    @Getter
    private int point;

    @Setter
    @Getter
    @OneToMany
    @JoinColumn(name = "place")
    private List<ExchangeBD> exchangeList = new ArrayList<>();

    @Setter
    @Getter
    @OneToMany
    @JoinColumn(name = "place")
    private List<RefuelingBD> refuelingList = new ArrayList<>();

    public PlaceBD() {
    }
}
