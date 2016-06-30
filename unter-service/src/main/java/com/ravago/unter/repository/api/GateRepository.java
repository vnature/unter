package com.ravago.unter.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravago.unter.domain.Gate;

public interface GateRepository extends JpaRepository<Gate, Long> {

	Gate findByName(String name);
}
