package com.vergil.ats_system.model;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;

    private String contactPerson;

    private String email;

    private String phone;

    private String location;

    private String industry;

    public Client() {}

    public Client(Long id, String companyName, String contactPerson,
                  String email, String phone, String location, String industry) {
        this.id = id;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.industry = industry;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getCompanyName() { return companyName; }

    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getContactPerson() { return contactPerson; }

    public void setContactPerson(String contactPerson) { this.contactPerson = contactPerson; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public String getIndustry() { return industry; }

    public void setIndustry(String industry) { this.industry = industry; }
}