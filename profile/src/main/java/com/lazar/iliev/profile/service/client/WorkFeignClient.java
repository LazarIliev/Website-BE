package com.lazar.iliev.profile.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "work")  // fallback can be added
public interface WorkFeignClient {

    @GetMapping(value = "/api/v1/fetch", consumes = "application/json")
    public ResponseEntity<String> getWork(); // correlation id can be added for traceability
}
