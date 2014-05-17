package com.loadtest.entity;

import java.math.BigDecimal;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "member_details_test")
public class MemberDetailsEntity {

	@Id
	@Column(name = "ID")
	private String id;

	@Column(name = "User_ID")
	private Integer userId;

	@Column(name = "First_Name")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@Column(name = "Middle_Name")
	private String middleName;

	@Column(name = "Group_ID")
	private Integer groupId;

	@Column(name = "SSN")
	private String ssn;

	@Column(name = "Status_Code")
	private String statusCode;

	@Column(name = "Date_Created")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;

	@Column(name = "Created_By")
	private Integer createdBy;

	@Column(name = "Date_Updated")
	private Date dateUpdated;

	@Column(name = "Updated_By")
	private Integer updatedBy;

	@Column(name = "Effective_Date")
	private Date effectiveDate;

	@Column(name = "Term_Date")
	private Date termDate;

	@Column(name = "Reinstate_Date")
	private Date reinstateDate;

	@Column(name = "Subscriber_ID")
	private String subscriberId;

	@Column(name = "834_Status")
	private Integer status_834;

	@Column(name = "Title")
	private String title;

	@Column(name = "email")
	private String email;

	@Column(name = "mobile_phone")
	private String mobile;

	@Column(name = "Tobacco_Usage")
	private Byte tobaccoUsage;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "Home_Phone")
	private String homePhone;

	@Column(name = "Work_Phone")
	private String workPhone;

	@Column(name = "Work_Phone_Ext")
	private String workPhoneExt;

	@Column(name = "Marital_Status")
	private String maritalStatus;

	@Column(name = "Disabled")
	private Byte disabled;

	@Column(name = "gender")
	private Character gender;

	@Column(name = "Relation_Code")
	private String relationShipCode;

	@Column(name = "eSign_Fname")
	private String esignFirstname;

	@Column(name = "eSign_Lname")
	private String esignLastname;

	@Column(name = "eSign_Mname")
	private String esignMiddlename;

	@Column(name = "eSign_Date")
	private Date esignDate;

	@Column(name = "PCP_Number")
	private String pcpNumber;

	@Column(name = "Current_Patient")
	private Boolean currentPatient;

	@Column(name = "Student")
	private Boolean student;
	
	@Column(name="Source")
	private String sources;
	
	@Column(name="time_date")	
	private  BigDecimal timeDate;
	
	

	/*@OneToMany(targetEntity = MemberAddressDetailsEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "member_id", referencedColumnName = "ID", nullable = false)
	private Set<MemberAddressDetailsEntity> memberAddressChild;
	
	
	@OneToMany(targetEntity=MemberOtherInsuranceEntity.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Member_Id",referencedColumnName="ID",nullable=false)
	private Set<MemberOtherInsuranceEntity> memberOtherInsuranceEntityChild;
	
	
	@OneToMany(targetEntity=MapMemberToCommPrefEntity.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Member_Id",referencedColumnName="ID",nullable=false)
	private Set<MapMemberToCommPrefEntity>  mapMemberToCompPrefEntityChild;*/
	
	
	
	public BigDecimal getTimeDate() {
		return timeDate;
	}

	public void setTimeDate(BigDecimal timeDate) {
		this.timeDate = timeDate;
	}

	public String getSources() {
		return sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*public Set<MemberAddressDetailsEntity> getMemberAddressChild() {
		return memberAddressChild;
	}

	public void setMemberAddressChild(
			Set<MemberAddressDetailsEntity> memberAddressChild) {
		this.memberAddressChild = memberAddressChild;
	}*/

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getTermDate() {
		return termDate;
	}

	public void setTermDate(Date termDate) {
		this.termDate = termDate;
	}

	public Date getReinstateDate() {
		return reinstateDate;
	}

	public void setReinstateDate(Date reinstateDate) {
		this.reinstateDate = reinstateDate;
	}

	public Integer getStatus_834() {
		return status_834;
	}

	public void setStatus_834(Integer status_834) {
		this.status_834 = status_834;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getWorkPhoneExt() {
		return workPhoneExt;
	}

	public void setWorkPhoneExt(String workPhoneExt) {
		this.workPhoneExt = workPhoneExt;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Byte getDisabled() {
		return disabled;
	}

	public void setDisabled(Byte disabled) {
		this.disabled = disabled;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Byte getTobaccoUsage() {
		return tobaccoUsage;
	}

	public void setTobaccoUsage(Byte tobaccoUsage) {
		this.tobaccoUsage = tobaccoUsage;
	}

	public String getRelationShipCode() {
		return relationShipCode;
	}

	public void setRelationShipCode(String relationShipCode) {
		this.relationShipCode = relationShipCode;
	}

	public String getEsignFirstname() {
		return esignFirstname;
	}

	public void setEsignFirstname(String esignFirstname) {
		this.esignFirstname = esignFirstname;
	}

	public String getEsignLastname() {
		return esignLastname;
	}

	public void setEsignLastname(String esignLastname) {
		this.esignLastname = esignLastname;
	}

	public String getEsignMiddlename() {
		return esignMiddlename;
	}

	public void setEsignMiddlename(String esignMiddlename) {
		this.esignMiddlename = esignMiddlename;
	}

	public Date getEsignDate() {
		return esignDate;
	}

	public void setEsignDate(Date esignDate) {
		this.esignDate = esignDate;
	}

	public String getPcpNumber() {
		return pcpNumber;
	}

	public void setPcpNumber(String pcpNumber) {
		this.pcpNumber = pcpNumber;
	}

	public Boolean getCurrentPatient() {
		return currentPatient;
	}

	public void setCurrentPatient(Boolean currentPatient) {
		this.currentPatient = currentPatient;
	}

	public Boolean getStudent() {
		return student;
	}

	public void setStudent(Boolean student) {
		this.student = student;
	}

	/*public Set<MemberOtherInsuranceEntity> getMemberOtherInsuranceEntityChild() {
		return memberOtherInsuranceEntityChild;
	}

	public void setMemberOtherInsuranceEntityChild(
			Set<MemberOtherInsuranceEntity> memberOtherInsuranceEntityChild) {
		this.memberOtherInsuranceEntityChild = memberOtherInsuranceEntityChild;
	}

	public Set<MapMemberToCommPrefEntity> getMapMemberToCompPrefEntityChild() {
		return mapMemberToCompPrefEntityChild;
	}

	public void setMapMemberToCompPrefEntityChild(
			Set<MapMemberToCommPrefEntity> mapMemberToCompPrefEntityChild) {
		this.mapMemberToCompPrefEntityChild = mapMemberToCompPrefEntityChild;
	}
*/
	
	public String toString(){
		return id+""+timeDate;
	}
		
}