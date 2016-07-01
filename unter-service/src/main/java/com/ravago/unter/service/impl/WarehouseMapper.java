package com.ravago.unter.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ravago.unter.domain.Warehouse;
import com.ravago.unter.service.api.WarehouseResult;

@Component
public class WarehouseMapper {

	public WarehouseResult map(Warehouse from) {
		WarehouseResult to = new WarehouseResult();
		to.setName(from.getName());
		return to;
	}
	
	public List<WarehouseResult> map(List<Warehouse> froms) {
		List<WarehouseResult> toList = new ArrayList<WarehouseResult>();
		for (Warehouse from : froms) {
			toList.add(map(from));
		}
		return toList;
	}
}
