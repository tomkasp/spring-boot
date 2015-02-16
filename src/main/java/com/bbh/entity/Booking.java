package com.bbh.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    public Long id;

    public String name;
    public String surnam;
}
