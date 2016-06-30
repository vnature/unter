package com.ravago.unter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="GATES")
public class Gate {

	@Id
	@Column(name="GATE_ID")
	private long id;
	@Column(name="NAME")
	private String name;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="WAREHOUSE_ID",referencedColumnName="WAREHOUSE_ID")
	private Warehouse warehouse;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	
	
	
}
