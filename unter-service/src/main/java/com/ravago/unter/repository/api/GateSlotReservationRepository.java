package com.ravago.unter.repository.api;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravago.unter.domain.GateSlotReservation;

public interface GateSlotReservationRepository extends JpaRepository<GateSlotReservation, Long>{

	List<GateSlotReservation> findByWarehouseNameAndLoadDate(String warehouse, Date loadDate);
}
