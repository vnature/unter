package com.ravago.unter.domain;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="GATE_SLOT_RESERVATIONS")
public class GateSlotReservation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GATE_SLOT_RESERVATION_ID")
	private Long id;
	@Column(name="RESERVATION_NUMBER")
	private String reservationNo;
	@ManyToOne
	@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID")
	private Order order;
	@ManyToOne
	@JoinColumn(name="GATE_ID",referencedColumnName="GATE_ID")
	private Gate gate;
	@Column(name="LOAD_DATE")
	private Date loadDate;
	@Column(name="FROM_TIME")
	private Time fromTime;
	@Column(name="TILL_TIME")
	private Time tillTime;
	@Column(name="REFERENCE")
	private String reference;
	@Column(name="NUMBER_PLATE")
	private String numberPlate;
	@Column(name="DRIVER_NAME")
	private String driverName;
	@Column(name="VEHICLE_TYPE")
	private String vehicleType;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReservationNo() {
		return reservationNo;
	}
	public void setReservationNo(String reservationNo) {
		this.reservationNo = reservationNo;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Gate getGate() {
		return gate;
	}
	public void setGate(Gate gate) {
		this.gate = gate;
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
