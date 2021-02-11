package com.crok.backend;
import com.crok.backend.model.*;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class teste {
	
	@GetMapping
	public String get() {
		return "OI";
	}
	
	@PostMapping
	public String post(@RequestBody Map<String, Object>dados) {
		return "Ok post"+dados.get("nome");
	}
	
	@PutMapping
	public void put() {
		System.out.println("put ok");
	}
	
	@DeleteMapping
	public void delete() {
		System.out.println("delete");
	}
}
