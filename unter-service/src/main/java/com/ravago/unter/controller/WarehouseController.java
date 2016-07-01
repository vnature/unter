package com.ravago.unter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ravago.unter.service.api.GateResult;
import com.ravago.unter.service.api.WarehouseResult;
import com.ravago.unter.service.api.WarehouseService;

@Controller
@RequestMapping("/warehouses")
public class WarehouseController {

	@Autowired
	private WarehouseService warehouseService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<WarehouseResult>> listWarehouses() {
		List<WarehouseResult> warehouses = warehouseService.listWarehouses();
		return ResponseEntity.ok().body(warehouses);
	}
	
	@RequestMapping(value="/{warehouseName}/gates", method=RequestMethod.GET)
	public ResponseEntity<List<GateResult>> listGates(@PathVariable("warehouseName") String warehouseName) {
		return ResponseEntity.ok().body(warehouseService.listGates(warehouseName));
	}
}
