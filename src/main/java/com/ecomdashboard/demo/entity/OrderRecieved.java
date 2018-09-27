package com.ecomdashboard.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="OrderRecieved", schema="ecomdashapp")
public class OrderRecieved extends KeyEntity{
	
	@Column(name="orderReceived", nullable = false)
	private int orderReceived;
	@Column(name="dateREceived")
	private String dateREceived;
	
	
	public int getOrderReceived() {
		return orderReceived;
	}
	public void setOrderReceived(int orderReceived) {
		this.orderReceived = orderReceived;
	}
	public String getDateREceived() {
		return dateREceived;
	}
	public void setDateREceived(String dateREceived) {
		this.dateREceived = dateREceived;
	}

}
