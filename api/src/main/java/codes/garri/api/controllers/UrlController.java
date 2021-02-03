package codes.garri.api.controllers;

import codes.garri.api.dtos.ShortenUrlDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("api/v1")
public class UrlController {

    @PostMapping("/shorten")
    public ResponseEntity<ShortenUrlDTO> shortenURL(@RequestBody String longUrl) {
        ShortenUrlDTO mock = new ShortenUrlDTO("https://github.com/garri-codes/garri.ly", "garri.ly/aoba");

        return ResponseEntity.ok(mock);
    }

    @GetMapping("/shortUrl/{hashValue}")
    public ResponseEntity getShortUrlAndRedirect(@PathVariable String hashValue) {

        return ResponseEntity
                .status(HttpStatus.FOUND)
                .location(URI.create("https://github.com/garri-codes/garri.ly"))
                .build();
    }
}
