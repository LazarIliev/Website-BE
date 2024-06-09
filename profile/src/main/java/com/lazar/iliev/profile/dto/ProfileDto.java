package com.lazar.iliev.profile.dto;


import jakarta.persistence.*;
import lombok.*;

@Data
public class ProfileDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long profileId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "summary")
    private String summary;

    @Column(name = "skills")
    private String skills;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "languages")
    private String languages;

    @Column(name = "hobbies")
    private String hobbies;

    @Column(name = "github")
    private String github;

    @Column(name = "linkedin")
    private String linkedIn;
}
