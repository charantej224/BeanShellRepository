package com.charan.shell.models;

import java.io.Serializable;

/**
 * A PolicyDetails.
 */
public class PolicyDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String policyCode;

	private String planCode;

	private String planType;

	private String status;

	private String riderNames;

	private String paymentTransactionNo;

	private String prnNo;

	private String encryptedPrnNo;

	private String nric;

	private String name;

	private String gender;

	private String birthDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPolicyCode() {
		return policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public String getPlanCode() {
		return planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRiderNames() {
		return riderNames;
	}

	public void setRiderNames(String riderNames) {
		this.riderNames = riderNames;
	}

	public String getPaymentTransactionNo() {
		return paymentTransactionNo;
	}

	public void setPaymentTransactionNo(String paymentTransactionNo) {
		this.paymentTransactionNo = paymentTransactionNo;
	}

	public String getPrnNo() {
		return prnNo;
	}

	public void setPrnNo(String prnNo) {
		this.prnNo = prnNo;
	}

	public String getEncryptedPrnNo() {
		return encryptedPrnNo;
	}

	public void setEncryptedPrnNo(String encryptedPrnNo) {
		this.encryptedPrnNo = encryptedPrnNo;
	}

	public String getNric() {
		return nric;
	}

	public void setNric(String nric) {
		this.nric = nric;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
