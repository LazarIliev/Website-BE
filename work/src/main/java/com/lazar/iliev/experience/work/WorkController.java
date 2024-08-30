package com.lazar.iliev.experience.work;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1", produces = {MediaType.APPLICATION_JSON_VALUE})
public class WorkController {

    @GetMapping(value = "/fetch")
    public ResponseEntity<String> getWork() {
        return ResponseEntity.status(HttpStatus.OK).body("This is from the work service!");
    }
}
