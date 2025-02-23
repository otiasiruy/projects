package com.tinyurl.controller;

import org.springframework.web.bind.annotation.*;

// This tells Spring we are returning data in the response body directly
@RestController
@RequestMapping("/api")
public class TinyUrlController {

    // Example endpoint that receives a URL via POST and returns a shorter one
    @PostMapping("/shorten")
    public String shortenUrl(@RequestBody String originalUrl) {
        // In a real app, you'd have logic to generate or retrieve the short URL
        // For now, just pretend:
        String shortenedUrl = "http://tiny.url/abc123";
        return shortenedUrl;
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
    // Or if you need more complex JSON response:
    // @PostMapping("/shorten")
    // public Map<String, String> shortenUrl(@RequestBody String originalUrl) {
    //     String shortenedUrl = "http://tiny.url/abc123";
    //     return Collections.singletonMap("shortUrl", shortenedUrl);
    // }
}