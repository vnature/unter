package com.ravago.unter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.db2.jcc.am.w;
import com.ravago.unter.domain.Warehouse;
import com.ravago.unter.repository.api.WarehouseRepository;
import com.ravago.unter.service.api.WarehouseResult;
import com.ravago.unter.service.api.WarehouseService;

@Service
public class WarehouseServiceImpl implements WarehouseService {

	@Autowired
	private WarehouseRepository warehouseRepository;
	@Autowired
	private WarehouseMapper warehouseMapper;
	@Override
	public List<WarehouseResult> listWarehouses() {
		List<Warehouse> warehouses = warehouseRepository.findAll();
		return warehouseMapper.map(warehouses);
	}

	
}
