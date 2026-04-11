package com.saveserve.backend;

import jakarta.persistence.*;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;

    private String foodType;
    private String category;
    private String quantity;
    private String unit;

    private String expiry;

    private String address;
    private String city;
    private String state;
    private String zip;

    private String pickupDate;
    private String time;

    private String status = "Pending";   // 🔥 IMPORTANT

    // getters & setters
}