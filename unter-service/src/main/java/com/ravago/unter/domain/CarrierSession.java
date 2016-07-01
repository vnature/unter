package com.ravago.unter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CARRIER_SESSIONS")
public class CarrierSession {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CARRIER_SESSION_ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="CARRIER_ID",referencedColumnName="CARRIER_ID")
	private Carrier carrier;
	
	@Column(name="SESSION_ID")
	private String sessionId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Carrier getCarrier() {
		return carrier;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	
}
