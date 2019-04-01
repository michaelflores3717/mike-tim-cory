package com.example.symbri.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profiles")
public class Profile {

    @Id
    private String randomIdentifier;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String address;

    public String getRandomIdentifier() {
        return randomIdentifier;
    }

    public void setRandomIdentifier(String randomIdentifier) {
        this.randomIdentifier = randomIdentifier;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
