package com.lazar.iliev.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/api/v1", produces = {MediaType.APPLICATION_JSON_VALUE})
public class ProfileController {

    // fullName
    // email
    // summary
    // skills
    // nationality
    // Languages
    // hobbies
    // github
    // linkedIn

    //--------------------
    //WorkExperience
    // companyName
    // start date
    // end date
    // job role
    // summary
    // project links ???

    @Value("${build.version}")
    private String buildVersion;

    @GetMapping("/build-info")
    public ResponseEntity<String> getBuildInfo() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(buildVersion);
    }
}
