package com.ravago.unter.domain;

import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import com.ravago.unter.service.api.GateSlotReservationCommand;
import com.ravago.unter.service.api.GateSlotReservationResult;
import com.ravago.unter.service.api.GateSlotReservationService;

@Controller
@RequestMapping("/gateslots/reservations")
public class GatSlotReservationController {

	@Autowired
	private GateSlotReservationService gateSlotReservationService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> reserve(@RequestBody GateSlotReservationCommand reservation, UriComponentsBuilder b) {
		String reservationNo = gateSlotReservationService.reserveGateSlot(reservation);
		URI location = b.path("/gateslots/reservations/{reservationNo}").buildAndExpand(reservationNo).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@RequestMapping(value="/{reservationNo}", method=RequestMethod.GET)
	public ResponseEntity<GateSlotReservationResult> get(@PathVariable("reservationNo") String reservationNo) {
		GateSlotReservationResult reservation = gateSlotReservationService.getGateSlotReservation(reservationNo);
		return ResponseEntity.ok().body(reservation);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<GateSlotReservationResult>> listGateSlotReservations(@RequestParam String warehouseName,@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date loadDate) {
		List<GateSlotReservationResult> reservations = gateSlotReservationService.listGateSlotReservations(warehouseName, loadDate);
		return ResponseEntity.ok().body(reservations);
	}
	
}
