package com.crok.backend.rest;
import com.crok.backend.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crok.backend.FilmeDao;


@RestController
@RequestMapping("/filme")
public class FilmeRest {
	
	@Autowired
	private FilmeDao filmeDao;
	
	@GetMapping
	public List<Filme> get(){
		return filmeDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Filme filme) {
		filmeDao.save(filme);
	}
	
	@DeleteMapping("/{id}")
	public void delete(Integer id) {
		filmeDao.deleteById(id);
	}
	
}
