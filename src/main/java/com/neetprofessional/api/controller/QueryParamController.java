package com.neetprofessional.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryParamController {

    @GetMapping("/query/param")
    public ResponseEntity<String> getQueryParam(@RequestParam("name") String name) {
        System.out.println("name: " + name);
        return new ResponseEntity<>("{'result': 'success'}", HttpStatus.OK);
    }
}
