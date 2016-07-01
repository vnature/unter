package com.ravago.unter.service.api;

import java.sql.Time;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GateSlotReservationCommand {

	private String warehouse;
	private String gate;
	private String orderNo;
	private Date loadDate;
	@JsonFormat(locale = "be", shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "GMT")
	private Date fromTime;
	@JsonFormat(locale = "be", shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "GMT")
	private Date tillTime;
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
	public Date getFromTime() {
		return fromTime;
	}
	public void setFromTime(Date fromTime) {
		this.fromTime = fromTime;
	}
	public Date getTillTime() {
		return tillTime;
	}
	public void setTillTime(Date tillTime) {
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
