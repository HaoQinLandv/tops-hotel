package com.car.beans;
// Generated 2016-6-30 16:26:30 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Models generated by hbm2java
 */
public class Models implements java.io.Serializable {

	private Integer id;
	private String brand;
	private String models;
	private String image;
	private Float officialPrice;
	private String sketch;
	private String link;
	private Date createTime;

	public Models() {
	}

	public Models(String brand, String models, String image, Float officialPrice, String sketch, String link,
			Date createTime) {
		this.brand = brand;
		this.models = models;
		this.image = image;
		this.officialPrice = officialPrice;
		this.sketch = sketch;
		this.link = link;
		this.createTime = createTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModels() {
		return this.models;
	}

	public void setModels(String models) {
		this.models = models;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Float getOfficialPrice() {
		return this.officialPrice;
	}

	public void setOfficialPrice(Float officialPrice) {
		this.officialPrice = officialPrice;
	}

	public String getSketch() {
		return this.sketch;
	}

	public void setSketch(String sketch) {
		this.sketch = sketch;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
