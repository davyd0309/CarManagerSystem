package pl.cms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Konrad on 06.01.2016.
 */
@Entity
@Table(name = "Miejsca")
public class PlaceBD {


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

    public PlaceBD() {
    }
}
