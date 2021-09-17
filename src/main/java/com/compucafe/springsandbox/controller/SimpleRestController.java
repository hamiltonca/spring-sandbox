package com.compucafe.springsandbox.controller;

import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    @GetMapping("/rest")
    public ResponseEntity<?> getRest() {
        Link link = Link.of("/rest");
        return ResponseEntity.ok(link);
    }
}
