package com.garrily.api.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController 
import org.springframework.web.bind.annotation.GetMapping

@RestController 
class AobaController {

	@GetMapping("/aoba") 
	fun aoba() : ResponseEntity<String> = ResponseEntity.ok("Aoba")
}
