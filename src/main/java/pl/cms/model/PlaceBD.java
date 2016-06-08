package pl.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @NotNull
    @Size(min = 3,max = 100)
    private String name;

    @Column(name = "adresMiejsca")
    @Setter
    @Getter
    @NotNull
    @Size(min = 10,max = 100)
    private String address;

    @Column(name = "iloscPunktow")
    @Setter
    @Getter
    private int point;



    public PlaceBD() {
    }
}
