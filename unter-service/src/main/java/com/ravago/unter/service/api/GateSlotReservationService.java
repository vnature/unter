package com.ravago.unter.service.api;

import java.util.Date;
import java.util.List;

public interface GateSlotReservationService {

	String reserveGateSlot(GateSlotReservationCommand gsr);
	
	List<GateSlotReservationResult> listGateSlotReservations(String warehouse, Date loadDate);
}
