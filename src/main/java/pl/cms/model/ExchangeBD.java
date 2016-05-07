package pl.cms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
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
    private Date exchangeDate;


    @Setter
    @Getter
    @Column(name = "opisWymiany")
    private String exchangeDescription;

    @Setter
    @Getter
    @Column(name = "oplataZaWymiane")
    private BigDecimal exchangePrice;


    @Setter
    @Getter
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="placeId")
    private PlaceBD placeId;

    @Setter
    @Getter
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="carId")
    private CarBD carId;

    public ExchangeBD() {
    }

    @Override
    public String toString() {
        return "ExchangeBD{" +
                "Id=" + Id +
                ", exchangeDate=" + exchangeDate +
                ", exchangeDescription='" + exchangeDescription + '\'' +

                
                '}';
    }
}
