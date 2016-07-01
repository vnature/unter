package com.ravago.unter.service.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ravago.unter.domain.Gate;

@Component
public class GateMapper {

	public GateResult map(Gate from) {
		GateResult to = new GateResult();
		to.setName(from.getName());
		return to;
	}
	
	public List<GateResult> map(List<Gate> froms) {
		List<GateResult> toList = new ArrayList<>();
		for (Gate from : froms) {
			toList.add(map(from));
		}
		return toList;
	}
}
