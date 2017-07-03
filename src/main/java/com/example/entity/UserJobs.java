package com.example.entity;
// Generated Jul 3, 2017 4:20:51 PM by Hibernate Tools 5.2.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserJobs generated by hbm2java
 */
@Entity
@Table(name = "USER_JOBS")
public class UserJobs implements java.io.Serializable {

	private BigDecimal id;
	private String userName;
	private Date createdDate;
	private Date modifiedDate;
	private String schedulerName;
	private UserJobsDetails userJobsDetails;

	public UserJobs() {
	}

	public UserJobs(BigDecimal id, String userName) {
		this.id = id;
		this.userName = userName;
	}

	public UserJobs(BigDecimal id, String userName, Date createdDate, Date modifiedDate, String schedulerName,
			UserJobsDetails userJobsDetails) {
		this.id = id;
		this.userName = userName;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.schedulerName = schedulerName;
		this.userJobsDetails = userJobsDetails;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "USER_NAME", nullable = false, length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE", length = 7)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFIED_DATE", length = 7)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Column(name = "SCHEDULER_NAME", length = 100)
	public String getSchedulerName() {
		return this.schedulerName;
	}

	public void setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "userJobs")
	public UserJobsDetails getUserJobsDetails() {
		return this.userJobsDetails;
	}

	public void setUserJobsDetails(UserJobsDetails userJobsDetails) {
		this.userJobsDetails = userJobsDetails;
	}

}
