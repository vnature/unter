package com.ravago.unter.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravago.unter.domain.CarrierSession;

public interface CarrierSessionRepository extends JpaRepository<CarrierSession, Long> {

	CarrierSession findBySessionId(String sessionId);
}
