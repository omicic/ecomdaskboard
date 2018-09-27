package com.ecomdashboard.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ProductCategory", schema="ecomdashapp")
public class ProductCategory extends KeyEntity{
	
	@Column(name="categoryName")
	private String categoryName;
	@Column(name="percentage")
	private int percentage;
	@Column(name="bestCategory")
	private boolean bestCategory;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public boolean isBestCategory() {
		return bestCategory;
	}
	public void setBestCategory(boolean bestCategory) {
		this.bestCategory = bestCategory;
	}
	
	
}
