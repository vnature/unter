package com.ravago.unter.service.api;

import java.util.List;

import com.ravago.unter.domain.Gate;

public interface WarehouseService {

	List<WarehouseResult> listWarehouses();
	
	List<GateResult> listGates(String warehouseName);
}
