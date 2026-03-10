package com.vergil.ats_system.model;

import jakarta.persistence.*;

@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String skills;

    private int experience;

    private String currentCompany;

    private String noticePeriod;

    private String status;

    private String resumeUrl;

    public Candidate() {}

    public Candidate(Long id, String name, String email, String phone, String skills,
                     int experience, String currentCompany, String noticePeriod, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.skills = skills;
        this.experience = experience;
        this.currentCompany = currentCompany;
        this.noticePeriod = noticePeriod;
        this.status = status;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getSkills() { return skills; }

    public void setSkills(String skills) { this.skills = skills; }

    public int getExperience() { return experience; }

    public void setExperience(int experience) { this.experience = experience; }

    public String getCurrentCompany() { return currentCompany; }

    public void setCurrentCompany(String currentCompany) { this.currentCompany = currentCompany; }

    public String getNoticePeriod() { return noticePeriod; }

    public void setNoticePeriod(String noticePeriod) { this.noticePeriod = noticePeriod; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getResumeUrl() { return resumeUrl; }
    public void setResumeUrl(String resumeUrl) { this.resumeUrl = resumeUrl; }
}