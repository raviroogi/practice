package com.test.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shopavaility")

public class shopAvailabilityEntity {
	
	private Long id;
	private String fromDate;
	private String toDate;
	private String fromTime;
	private String toTime;
	private String intervals;
	private String shopType;
	
	@Id
	@Column(name="id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="fromDate")
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	@Column(name="toDate")
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	@Column(name="fromTime")
	public String getFromTime() {
		return fromTime;
	}
	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}
	@Column(name="toTime")
	public String getToTime() {
		return toTime;
	}
	public void setToTime(String toTime) {
		this.toTime = toTime;
	}
	@Column(name="intervals")
	public String getIntervals() {
		return intervals;
	}
	public void setIntervals(String intervals) {
		this.intervals = intervals;
	}
	@Column(name="shopType")
	public String getShopType() {
		return shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}



}
