package com.kloudpod.storeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/store")
public class StoreController {
    @GetMapping
    public String storeInfo() {
        return "Welcome to Kloudpod Store";
    }
}
