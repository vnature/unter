package com.ravago.unter.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravago.unter.domain.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {

	Warehouse findByName(String name);
}
