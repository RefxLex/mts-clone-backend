package com.reflex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reflex.model.Tarif;

public interface TarifRepository extends JpaRepository<Tarif, Long> {
	
}
