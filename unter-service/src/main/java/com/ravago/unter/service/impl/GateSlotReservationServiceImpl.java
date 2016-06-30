package com.ravago.unter.service.impl;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravago.unter.domain.GateSlotReservation;
import com.ravago.unter.domain.Warehouse;
import com.ravago.unter.repository.api.GateRepository;
import com.ravago.unter.repository.api.GateSlotReservationRepository;
import com.ravago.unter.repository.api.OrderRepository;
import com.ravago.unter.repository.api.WarehouseRepository;
import com.ravago.unter.service.api.GateSlotReservationCommand;
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
		r.setGate(gateRepository.findByName(gsr.getGate()));
		r.setOrder(orderRepository.findByOrderNo(gsr.getOrderNo()));
		r.setReservationNo(UUID.randomUUID().toString());
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
		return gateSlotReservationMapper.map(gateSlotReservationRepository.findByReservationNo(reservationNo));
	}
	
	

	
}
