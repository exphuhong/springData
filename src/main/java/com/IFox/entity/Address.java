package com.IFox.entity;

import javax.persistence.*;

/**
 * Created by exphuhong
 * Date 17-11-27.
 * Start
 */
@Table(name = "JPA_ADDRESS")
@Entity
public class Address {
    private Integer id;

    private String province;
    private String city;

    private Integer addressId;



    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "ADD_ID")
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}
