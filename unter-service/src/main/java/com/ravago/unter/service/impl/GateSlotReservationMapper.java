package com.ravago.unter.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ravago.unter.domain.GateSlotReservation;
import com.ravago.unter.service.api.GateSlotReservationResult;

@Component
public class GateSlotReservationMapper {

	public GateSlotReservationResult map(GateSlotReservation from) {
		if (from == null) {
			return null;
		}
		GateSlotReservationResult to = new GateSlotReservationResult();
		to.setFromTime(from.getFromTime());
		to.setGate(from.getGate().getName());
		to.setLoadDate(from.getLoadDate());
		to.setOrderNo(from.getOrder().getOrderNo());
		to.setTillTime(from.getTillTime());
		to.setWarehouse(from.getGate().getWarehouse().getName());
		to.setDriverName(from.getDriverName());
		to.setVehicleType(from.getVehicleType());
		to.setReference(from.getReference());
		to.setNumberPlate(from.getNumberPlate());
		return to;
	}
	
	public List<GateSlotReservationResult> map(List<GateSlotReservation> froms) {
		List<GateSlotReservationResult> toList = new ArrayList<GateSlotReservationResult>();
		for (GateSlotReservation from : froms) {
			toList.add(map(from));
		}
		return toList;
	}	
}
