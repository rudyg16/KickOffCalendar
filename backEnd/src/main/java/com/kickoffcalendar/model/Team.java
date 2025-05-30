package com.kickoffcalendar.model;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class Team {

    private Long id;
    private String name;
    private String logoUrl; 
    private String country;
    private ZonedDateTime createdAt; 
    protected void onCreate() {
        this.createdAt = ZonedDateTime.now(ZoneOffset.UTC);
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
