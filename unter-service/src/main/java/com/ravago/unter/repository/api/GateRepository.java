package com.ravago.unter.repository.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravago.unter.domain.Gate;

public interface GateRepository extends JpaRepository<Gate, Long> {

	Gate findByName(String name);
	List<Gate> findByWarehouseName(String warehouseName);
}
