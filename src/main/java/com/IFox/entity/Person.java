package com.IFox.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by exphuhong
 * Date 17-11-27.
 * Start
 */
@Table(name = "JPA_PERSON")
@Entity
public class Person {
    private Integer id;
    private String name;

    private String email;
    private LocalDate date;
    private Address address;

    @JoinColumn(name = "ADDRESS_ID")
    @ManyToOne
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", address=" + address +
                '}';
    }
}
