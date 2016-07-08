package com.car.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="custom") 
public class Custom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;  
	
	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 性别
	 */
	private Long sex;
	
	/**
	 * 微信号
	 */
	private String wechatId;
	
	/**
	 * 手机号
	 */
	private String phone;
	
	/**
	 * 地址
	 */
	private String address;
	
	/**
	 * 车型
	 */
	private String models;
	
	/**
	 * 购车日期
	 */
	private String datePurchase;
	
	/**
	 * 车牌号
	 */
	private String plateNumber;
	
	/**
	 * 品牌
	 */
	private String brand;
	
	/**
	 * 级别ID
	 */
	private Long levelId;
	
	/**
	 * 创建日期
	 */
	private Date createDate;


	
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="id",unique=true)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="name") 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="sex") 
	public Long getSex() {
		return sex;
	}

	public void setSex(Long sex) {
		this.sex = sex;
	}

	@Column(name="wechat_id") 
	public String getWechatId() {
		return wechatId;
	}

	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}

	@Column(name="phone") 
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name="address") 
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="models") 
	public String getModels() {
		return models;
	}

	public void setModels(String models) {
		this.models = models;
	}

	@Column(name="date_purchase") 
	public String getDatePurchase() {
		return datePurchase;
	}

	public void setDatePurchase(String datePurchase) {
		this.datePurchase = datePurchase;
	}

	@Column(name="plate_number") 
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	@Column(name="brand") 
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name="level_id") 
	public Long getLevelId() {
		return levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}

	@Column(name="create_date") 
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	

}

