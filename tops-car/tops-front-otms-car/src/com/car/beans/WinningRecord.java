package com.car.beans;
// Generated 2016-6-30 16:26:30 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * WinningRecord generated by hbm2java
 */
public class WinningRecord implements java.io.Serializable {

	private Integer id;
	private Integer activityId;
	private Integer customId;
	private Integer awardStatus;
	private Integer winningGrade;
	private Integer useStatus;
	private Date createTime;

	public WinningRecord() {
	}

	public WinningRecord(Integer activityId, Integer customId, Integer awardStatus, Integer winningGrade,
			Integer useStatus, Date createTime) {
		this.activityId = activityId;
		this.customId = customId;
		this.awardStatus = awardStatus;
		this.winningGrade = winningGrade;
		this.useStatus = useStatus;
		this.createTime = createTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getCustomId() {
		return this.customId;
	}

	public void setCustomId(Integer customId) {
		this.customId = customId;
	}

	public Integer getAwardStatus() {
		return this.awardStatus;
	}

	public void setAwardStatus(Integer awardStatus) {
		this.awardStatus = awardStatus;
	}

	public Integer getWinningGrade() {
		return this.winningGrade;
	}

	public void setWinningGrade(Integer winningGrade) {
		this.winningGrade = winningGrade;
	}

	public Integer getUseStatus() {
		return this.useStatus;
	}

	public void setUseStatus(Integer useStatus) {
		this.useStatus = useStatus;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
