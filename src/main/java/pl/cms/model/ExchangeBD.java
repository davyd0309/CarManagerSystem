package pl.cms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @NotNull
    private Date exchangeDate;


    @Setter
    @Getter
    @Column(name = "opisWymiany")
    @NotNull
    @Size(min = 3,max = 100)
    private String exchangeDescription;

    @Setter
    @Getter
    @Column(name = "oplataZaWymiane")
    @NotNull
    private BigDecimal exchangePrice;


    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "car",referencedColumnName = "id")
    private CarBD car;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "place",referencedColumnName = "id")
    private PlaceBD place;

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
