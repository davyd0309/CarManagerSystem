package pl.cms.model;

import javax.persistence.*;

/**
 * Created by Judytka on 2015-12-19.
 */
@Entity
@Table(name = "Wlasciciel")
public class User {


    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "imieWlasciciela")
    private String firstName;

    @Column(name = "nazwiskoWlasciciela")
    private String lastName;

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
