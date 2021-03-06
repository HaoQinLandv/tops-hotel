package com.car.bean;
// Generated 2016-6-30 15:25:28 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Custom generated by hbm2java
 */
public class Custom implements java.io.Serializable {

	private Integer id;
	private String name;
	private Integer sex;
	private String wechatId;
	private Integer phone;
	private String address;
	private String models;
	private Date datePurchase;
	private String plateNumber;
	private String brand;
	private Integer levelId;
	private Date createDate;

	public Custom() {
	}

	public Custom(Date createDate) {
		this.createDate = createDate;
	}

	public Custom(String name, Integer sex, String wechatId, Integer phone, String address, String models,
			Date datePurchase, String plateNumber, String brand, Integer levelId, Date createDate) {
		this.name = name;
		this.sex = sex;
		this.wechatId = wechatId;
		this.phone = phone;
		this.address = address;
		this.models = models;
		this.datePurchase = datePurchase;
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.levelId = levelId;
		this.createDate = createDate;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getWechatId() {
		return this.wechatId;
	}

	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}

	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getModels() {
		return this.models;
	}

	public void setModels(String models) {
		this.models = models;
	}

	public Date getDatePurchase() {
		return this.datePurchase;
	}

	public void setDatePurchase(Date datePurchase) {
		this.datePurchase = datePurchase;
	}

	public String getPlateNumber() {
		return this.plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getLevelId() {
		return this.levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
