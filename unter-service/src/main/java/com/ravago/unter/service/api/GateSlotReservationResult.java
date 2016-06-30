package com.ravago.unter.service.api;

import java.sql.Time;
import java.util.Date;

public class GateSlotReservationResult {

	private String warehouse;
	private String gate;
	private String orderNo;
	private Date loadDate;
	private Time fromTime;
	private Time tillTime;
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Date getLoadDate() {
		return loadDate;
	}
	public void setLoadDate(Date loadDate) {
		this.loadDate = loadDate;
	}
	public Time getFromTime() {
		return fromTime;
	}
	public void setFromTime(Time fromTime) {
		this.fromTime = fromTime;
	}
	public Time getTillTime() {
		return tillTime;
	}
	public void setTillTime(Time tillTime) {
		this.tillTime = tillTime;
	}
	
	
}
