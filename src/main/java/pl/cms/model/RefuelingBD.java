package pl.cms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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
    private Date refuelingDate;

    @Setter
    @Getter
    @Column(name = "oplataZaTankowanie")
    private BigDecimal refuelingPrice;

    @ManyToOne
    @JoinColumn(name = "miejsceId")
    @Setter
    @Getter
    private PlaceBD refuelingPlace;

    @ManyToOne
    @JoinColumn(name = "samochodId")
    @Setter
    @Getter
    private CarBD carBDId;


    public RefuelingBD() {
    }


    @Override
    public String toString() {
        return "RefuelingDao{" +
                "Id=" + Id +
                ", refuelingDate=" + refuelingDate +
                ", refuelingPrice=" + refuelingPrice +
                ", refuelingPlace=" + refuelingPlace +
                ", carId=" + carBDId +
                '}';
    }
}
