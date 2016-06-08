package pl.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Konrad on 2015-12-19.
 */
@Entity
@Table(name = "Tankowania")
public class RefuelingBD {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Integer Id;

    @Setter
    @Getter
    @Column(name = "dataTankowania")
    @NotNull
    private Date refuelingDate;

    @Setter
    @Getter
    @Column(name = "oplataZaTankowanie")
    @NotNull
    private BigDecimal refuelingPrice;

    @Setter
    @Getter
    @Column(name = "opisTankowania")
    @NotNull
    @Size(min = 3,max = 100)
    private String refuelingDescription;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "car",referencedColumnName = "id")
    private CarBD car;


    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "place",referencedColumnName = "id")
    private PlaceBD place ;

    public RefuelingBD() {
    }


    @Override
    public String toString() {
        return "RefuelingDao{" +
                "Id=" + Id +
                ", refuelingDate=" + refuelingDate +
                ", refuelingPrice=" + refuelingPrice +


                '}';
    }
}
