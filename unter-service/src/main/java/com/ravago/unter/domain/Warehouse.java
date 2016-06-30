package com.ravago.unter.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="WAREHOUSES")
public class Warehouse {

	@Id
	@Column(name="WAREHOUSE_ID")
	private long id;
	@Column(name="NAME")
	private String name;
	@OneToMany
	@JoinColumn(name="DASH106882.WAREHOUSE_ID",referencedColumnName="WAREHOUSE_ID")
	private List<Gate> gates;
	
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
	public List<Gate> getGates() {
		return gates;
	}
	public void setGates(List<Gate> gates) {
		this.gates = gates;
	}
	
	
}
