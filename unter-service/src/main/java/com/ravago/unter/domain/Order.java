package com.ravago.unter.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class Order {

	@Id
	@Column(name="ORDER_ID")
	private long id;
	@Column(name="ORDER_NUMBER")
	private String orderNo;
	@ManyToOne
	@JoinColumn(name="CARRIER_ID",referencedColumnName="CARRIER_ID")
	private Carrier carrier;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Carrier getCarrier() {
		return carrier;
	}
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}
	
	
}
