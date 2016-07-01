package com.ravago.unter.service.impl;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravago.unter.domain.Gate;
import com.ravago.unter.domain.GateSlotReservation;
import com.ravago.unter.domain.Order;
import com.ravago.unter.domain.Warehouse;
import com.ravago.unter.repository.api.GateRepository;
import com.ravago.unter.repository.api.GateSlotReservationRepository;
import com.ravago.unter.repository.api.OrderRepository;
import com.ravago.unter.repository.api.WarehouseRepository;
import com.ravago.unter.service.api.GateSlotReservationCommand;
import com.ravago.unter.service.api.GateSlotReservationException;
import com.ravago.unter.service.api.GateSlotReservationResult;
import com.ravago.unter.service.api.GateSlotReservationService;

@Service
public class GateSlotReservationServiceImpl implements GateSlotReservationService {

	@Autowired
	private GateSlotReservationRepository gateSlotReservationRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private GateRepository gateRepository;
	@Autowired
	private WarehouseRepository Warehouse;
	@Autowired
	private GateSlotReservationMapper gateSlotReservationMapper;
	
	public String reserveGateSlot(GateSlotReservationCommand gsr) {
		GateSlotReservation r = new GateSlotReservation(); 
		r.setFromTime(toTime(gsr.getFromTime()));
		r.setLoadDate(gsr.getLoadDate());
		r.setTillTime(toTime(gsr.getTillTime()));
		Gate gate = gateRepository.findByName(gsr.getGate());
		if (gate == null) {
			throw new GateSlotReservationException("Gate does not exists with the nmae "+gsr.getGate());
		}
		r.setGate(gate);
		Order order = orderRepository.findByOrderNo(gsr.getOrderNo());
		if (order == null) {
			throw new GateSlotReservationException("Order does not exist with number "+gsr.getOrderNo());
		}
		r.setOrder(order);
		r.setReservationNo(UUID.randomUUID().toString());
		r.setDriverName(gsr.getDriverName());
		r.setReference(gsr.getReference());
		r.setVehicleType(gsr.getVehicleType());
		r.setNumberPlate(gsr.getNumberPlate());
		gateSlotReservationRepository.save(r);
		return r.getReservationNo();
	}
	
	private Time toTime(Date d) {
		return new Time(d.getTime());
	}

	public List<GateSlotReservationResult> listGateSlotReservations(String warehouseName, Date loadDate) {
		return gateSlotReservationMapper.map(gateSlotReservationRepository.findByGateWarehouseNameAndLoadDate(warehouseName, loadDate));
	}

	@Override
	public GateSlotReservationResult getGateSlotReservation(String reservationNo) {
		GateSlotReservation r = gateSlotReservationRepository.findByReservationNo(reservationNo);
		return gateSlotReservationMapper.map(r);
	}
}
