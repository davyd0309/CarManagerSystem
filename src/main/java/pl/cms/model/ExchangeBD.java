package pl.cms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Konrad on 2015-12-19.
 */
@Entity
@Table(name = "Wymiany")
public class ExchangeBD {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Integer Id;

    @Setter
    @Getter
    @Column(name = "dataWymiany")
    private LocalDate exchangeDate;


    @Setter
    @Getter
    @Column(name = "opisWymiany")
    private String exchangeDescription;

    @ManyToOne
    @JoinColumn(name = "miejsceId")
    @Setter
    @Getter
    private PlaceBD exchangePlace;


    @ManyToOne
    @JoinColumn(name = "samochodId")
    @Setter
    @Getter
    private CarBD carBDId;


    public ExchangeBD() {
    }

    @Override
    public String toString() {
        return "ExchangeBD{" +
                "Id=" + Id +
                ", exchangeDate=" + exchangeDate +
                ", exchangeDescription='" + exchangeDescription + '\'' +
                ", exchangePlace=" + exchangePlace +
                ", carId=" + carBDId +
                '}';
    }
}
