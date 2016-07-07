package com.car.bean;
// Generated 2016-6-30 15:25:28 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * PromotionRecord generated by hbm2java
 */
public class PromotionRecord implements java.io.Serializable {

	private Integer id;
	private Integer promotionId;
	private Integer customId;
	private Integer frequency;
	private Integer stopbyTime;
	private Date createTime;

	public PromotionRecord() {
	}

	public PromotionRecord(Integer promotionId, Integer customId, Integer frequency, Integer stopbyTime,
			Date createTime) {
		this.promotionId = promotionId;
		this.customId = customId;
		this.frequency = frequency;
		this.stopbyTime = stopbyTime;
		this.createTime = createTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionId(Integer promotionId) {
		this.promotionId = promotionId;
	}

	public Integer getCustomId() {
		return this.customId;
	}

	public void setCustomId(Integer customId) {
		this.customId = customId;
	}

	public Integer getFrequency() {
		return this.frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	public Integer getStopbyTime() {
		return this.stopbyTime;
	}

	public void setStopbyTime(Integer stopbyTime) {
		this.stopbyTime = stopbyTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
