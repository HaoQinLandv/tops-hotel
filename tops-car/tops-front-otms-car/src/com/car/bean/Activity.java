package com.car.bean;
// Generated 2016-6-30 15:25:28 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Activity generated by hbm2java
 */
public class Activity implements java.io.Serializable {

	private Integer id;
	private String name;
	private Date startTime;
	private Date endTime;
	private String detail;
	private String prizeSetting;
	private Float probaility;
	private String activityType;
	private Date failureTime;
	private Date createTime;

	public Activity() {
	}

	public Activity(String name, Date startTime, Date endTime, String detail, String prizeSetting, Float probaility,
			String activityType, Date failureTime, Date createTime) {
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.detail = detail;
		this.prizeSetting = prizeSetting;
		this.probaility = probaility;
		this.activityType = activityType;
		this.failureTime = failureTime;
		this.createTime = createTime;
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

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPrizeSetting() {
		return this.prizeSetting;
	}

	public void setPrizeSetting(String prizeSetting) {
		this.prizeSetting = prizeSetting;
	}

	public Float getProbaility() {
		return this.probaility;
	}

	public void setProbaility(Float probaility) {
		this.probaility = probaility;
	}

	public String getActivityType() {
		return this.activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public Date getFailureTime() {
		return this.failureTime;
	}

	public void setFailureTime(Date failureTime) {
		this.failureTime = failureTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}