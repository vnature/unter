package com.ravago.unter.repository.api;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ravago.unter.domain.GateSlotReservation;
import com.ravago.unter.domain.Warehouse;

public interface GateSlotReservationRepository extends JpaRepository<GateSlotReservation, Long>{
	
	GateSlotReservation findByReservationNo(String reservationNo);
	
	List<GateSlotReservation> findByGateWarehouseNameAndLoadDate(String warehouseName, Date loadDate);
}
