package codes.garri.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("api/v1")
public class UrlController {

    @PostMapping("/shorten")
    public ResponseEntity shortenURL(@RequestBody String longUrl) {

        return ResponseEntity
                .ok("https://github.com/garri-codes/garri.ly");
    }

    @GetMapping("/shortUrl/{hashValue}")
    public ResponseEntity getShortUrlAndRedirect(@PathVariable String hashValue) {

        return ResponseEntity
                .status(HttpStatus.FOUND)
                .location(URI.create("https://github.com/garri-codes/garri.ly"))
                .build();
    }
}