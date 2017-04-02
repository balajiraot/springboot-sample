package com.sample.domain;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by bthum on 3/18/17.
 */
@Entity
@Table(name="ADDRESS")
public class Address implements Serializable {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="FIRST_LINE")
    @NotNull
    private String firstLine;

    @Column(name="SECOND_LINE")
    private String secondLine;

    @Column(name="ZIP_CODE")
    @NotNull
    private String zicCode;

    @Column(name="STATE_CODE")
    @NotNull
    private String stateCode;

    @Column(name="CITY")
    @NotNull
    private String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    public String getZicCode() {
        return zicCode;
    }

    public void setZicCode(String zicCode) {
        this.zicCode = zicCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (getId() != null ? !getId().equals(address.getId()) : address.getId() != null) return false;
        if (getFirstLine() != null ? !getFirstLine().equals(address.getFirstLine()) : address.getFirstLine() != null)
            return false;
        if (getSecondLine() != null ? !getSecondLine().equals(address.getSecondLine()) : address.getSecondLine() != null)
            return false;
        if (getZicCode() != null ? !getZicCode().equals(address.getZicCode()) : address.getZicCode() != null)
            return false;
        if (getStateCode() != null ? !getStateCode().equals(address.getStateCode()) : address.getStateCode() != null)
            return false;
        return getCity() != null ? getCity().equals(address.getCity()) : address.getCity() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getFirstLine() != null ? getFirstLine().hashCode() : 0);
        result = 31 * result + (getSecondLine() != null ? getSecondLine().hashCode() : 0);
        result = 31 * result + (getZicCode() != null ? getZicCode().hashCode() : 0);
        result = 31 * result + (getStateCode() != null ? getStateCode().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        return result;
    }
}
