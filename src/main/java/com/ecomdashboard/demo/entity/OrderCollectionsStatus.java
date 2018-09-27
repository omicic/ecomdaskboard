package com.ecomdashboard.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="OrderCollectionsStatus", schema="ecomdashapp")
public class OrderCollectionsStatus extends KeyEntity {

	@Column(name="newOrders")
	private int newOrders;
	@Column(name="revenue")
	private double revenue;
	@Column(name="shipped")
	private int shipped;
	@Column(name="returned")
	private int returned;
	
	public int getNewOrders() {
		return newOrders;
	}
	public void setNewOrders(int newOrders) {
		this.newOrders = newOrders;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public int getShipped() {
		return shipped;
	}
	public void setShipped(int shipped) {
		this.shipped = shipped;
	}
	public int getReturned() {
		return returned;
	}
	public void setReturned(int returned) {
		this.returned = returned;
	}
	
}
