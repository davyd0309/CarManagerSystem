package pl.cms.model;

import javax.persistence.*;

/**
 * Created by Judytka on 2015-12-19.
 */
@Entity
@Table(name = "Samochod")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nazwaSamochodu")
    private String carName;

    @Column(name = "numerSamochodu")
    private int carNumber;

    @Column(name = "stanLicznikaSamochodu")
    private int kmCounter;

    @ManyToOne
    @JoinColumn(name = "WlascicielSamochodu")
    private User carOwners;



//    private Exchange exchange;
//
//
//    private Refueling refueling;

    public Car() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public int getKmCounter() {
        return kmCounter;
    }

    public void setKmCounter(int kmCounter) {
        this.kmCounter = kmCounter;
    }

    public User getCarOwners() {
        return carOwners;
    }

    public void setCarOwners(User carOwners) {
        this.carOwners = carOwners;
    }

//    public Exchange getExchange() {
//        return exchange;
//    }
//
//    public void setExchange(Exchange exchange) {
//        this.exchange = exchange;
//    }
//
//    public Refueling getRefueling() {
//        return refueling;
//    }
//
//    public void setRefueling(Refueling refueling) {
//        this.refueling = refueling;
//    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", carNumber=" + carNumber +
                ", kmCounter=" + kmCounter +
                ", carOwners=" + carOwners +
                '}';
    }
}

