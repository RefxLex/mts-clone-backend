package com.reflex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reflex.model.Tarif;
import com.reflex.repository.TarifRepository;

@CrossOrigin
@RestController
@RequestMapping("/tarifs")
public class TarifController {
	
	@Autowired
	TarifRepository tarifRepository;
	
	@GetMapping("/all")
	public ResponseEntity<List<Tarif>> getAllTarifs(){
		return new ResponseEntity<>(tarifRepository.findAll(), HttpStatus.OK);
	}

}
