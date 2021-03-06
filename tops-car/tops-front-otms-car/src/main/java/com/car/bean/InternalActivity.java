package com.car.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Internal activity （内部H5活动记录）
 */

@Entity(name="internal_activity")
public class InternalActivity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;  

	/**
	 * 客户ID
	 */
	private Long customId;
	
	/**
	 * 活动ID
	 */
	private Long ActivityId;
	
	/**
	 * 浏览时间
	 */
	private Date stopbyTime;
	
	/**
	 * 次数
	 */
	private Long frequency;
	
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

	@Column(name="frequency")
	public Long getFrequency() {
		return frequency;
	}

	public void setFrequency(Long frequency) {
		this.frequency = frequency;
	}

	@Column(name="custom_id")
	public Long getCustomId() {
		return customId;
	}

	public void setCustomId(Long customId) {
		this.customId = customId;
	}

	@Column(name="Activity_id")
	public Long getActivityId() {
		return ActivityId;
	}

	public void setActivityId(Long activityId) {
		ActivityId = activityId;
	}

	@Column(name="stopby_time")
	public Date getStopbyTime() {
		return stopbyTime;
	}

	public void setStopbyTime(Date stopbyTime) {
		this.stopbyTime = stopbyTime;
	}

	@Column(name="create_date")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
