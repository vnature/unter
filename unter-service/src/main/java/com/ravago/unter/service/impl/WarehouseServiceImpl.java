package com.ravago.unter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.db2.jcc.am.w;
import com.ravago.unter.domain.Gate;
import com.ravago.unter.domain.Warehouse;
import com.ravago.unter.repository.api.GateRepository;
import com.ravago.unter.repository.api.WarehouseRepository;
import com.ravago.unter.service.api.GateMapper;
import com.ravago.unter.service.api.GateResult;
import com.ravago.unter.service.api.WarehouseResult;
import com.ravago.unter.service.api.WarehouseService;

@Service
public class WarehouseServiceImpl implements WarehouseService {

	@Autowired
	private WarehouseRepository warehouseRepository;
	@Autowired
	private WarehouseMapper warehouseMapper;
	@Autowired
	private GateRepository gateRepository;
	@Autowired
	private GateMapper gateMapper;
	@Override
	public List<WarehouseResult> listWarehouses() {
		List<Warehouse> warehouses = warehouseRepository.findAll();
		return warehouseMapper.map(warehouses);
	}
	@Override
	public List<GateResult> listGates(String warehouseName) {
		return gateMapper.map(gateRepository.findByWarehouseName(warehouseName));
	}

	
}
