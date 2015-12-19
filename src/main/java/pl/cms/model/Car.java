package pl.cms.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany
    @JoinColumn(name = "wlascicielSamochoduId")
    private List<User> carOwnerslist;


//    private List<Exchange> exchangeList;
//
//
//    private List<Refueling> refuelingList;


    public Car() {
       this.carOwnerslist = new ArrayList<User>();
    }

    public Integer getId() {
        return id;
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

    public List<User> getCarOwnerslist() {
        return carOwnerslist;
    }

    public void setCarOwnerslist(List<User> carOwnerslist) {
        this.carOwnerslist = carOwnerslist;
    }

//    public List<Exchange> getExchangeList() {
//        return exchangeList;
//    }
//
//    public void setExchangeList(List<Exchange> exchangeList) {
//        this.exchangeList = exchangeList;
//    }
//
//    public List<Refueling> getRefuelingList() {
//        return refuelingList;
//    }
//
//    public void setRefuelingList(List<Refueling> refuelingList) {
//        this.refuelingList = refuelingList;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", carNumber=" + carNumber +
                ", kmCounter=" + kmCounter +
                ", carOwnerslist=" + carOwnerslist +
                '}';
    }
}

