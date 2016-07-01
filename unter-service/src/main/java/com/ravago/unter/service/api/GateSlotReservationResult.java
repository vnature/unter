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
	private String reference;
	private String numberPlate;
	private String driverName;
	private String vehicleType;
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
	public String getReference() { return this.reference; }
	public void setReference(String reference) { this.reference = reference; }
	public String getNumberPlate() { return this.numberPlate; }
	public void setNumberPlate(String numberPlate) { this.numberPlate = numberPlate; }
	public String getDriverName() { return this.driverName; }
	public void setDriverName(String driverName) { this.driverName = driverName; }
	public String getVehicleType() { return this.vehicleType; }
	public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }
}
