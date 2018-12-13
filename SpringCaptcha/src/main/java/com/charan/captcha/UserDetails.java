package com.charan.captcha;

import java.io.Serializable;
import java.time.LocalDate;



/**
 * A UserDetails.
 */
public class UserDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nric;

    private String name;

    private String gender;

    private LocalDate birthDate;

    private String emailId;

    private String phoneNo;

    private String educationLevel;

    private Integer residentialPostalCode;

    private String residentialUnitNo;

    private String residentialAddress1;

    private String residentialAddress2;

    private String residentialAddress3;

    private String residentialAddress4;

    private Integer mailingPostalCode;

    private String mailingUnitNo;

    private String mailingAddress1;

    private String mailingAddress2;

    private String mailingAddress3;

    private String mailingAddress4;

    private String occupation;

    private String residentialStatus;

    private String nationality;

    private String countryOfBirth;

    private String nameOfEmployer;

    private Float annualIncome;

    private String addressType;

    private String maritalStatus;

    private String uinfin;

    private MyInfoStatus myInfoVerified;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNric() {
        return nric;
    }

    public UserDetails nric(String nric) {
        this.nric = nric;
        return this;
    }

    public void setNric(String nric) {
        this.nric = nric;
    }

    public String getName() {
        return name;
    }

    public UserDetails name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public UserDetails gender(String gender) {
        this.gender = gender;
        return this;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public UserDetails birthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmailId() {
        return emailId;
    }

    public UserDetails emailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public UserDetails phoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public UserDetails educationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public Integer getResidentialPostalCode() {
        return residentialPostalCode;
    }

    public UserDetails residentialPostalCode(Integer residentialPostalCode) {
        this.residentialPostalCode = residentialPostalCode;
        return this;
    }

    public void setResidentialPostalCode(Integer residentialPostalCode) {
        this.residentialPostalCode = residentialPostalCode;
    }

    public String getResidentialUnitNo() {
        return residentialUnitNo;
    }

    public UserDetails residentialUnitNo(String residentialUnitNo) {
        this.residentialUnitNo = residentialUnitNo;
        return this;
    }

    public void setResidentialUnitNo(String residentialUnitNo) {
        this.residentialUnitNo = residentialUnitNo;
    }

    public String getResidentialAddress1() {
        return residentialAddress1;
    }

    public UserDetails residentialAddress1(String residentialAddress1) {
        this.residentialAddress1 = residentialAddress1;
        return this;
    }

    public void setResidentialAddress1(String residentialAddress1) {
        this.residentialAddress1 = residentialAddress1;
    }

    public String getResidentialAddress2() {
        return residentialAddress2;
    }

    public UserDetails residentialAddress2(String residentialAddress2) {
        this.residentialAddress2 = residentialAddress2;
        return this;
    }

    public void setResidentialAddress2(String residentialAddress2) {
        this.residentialAddress2 = residentialAddress2;
    }

    public String getResidentialAddress3() {
        return residentialAddress3;
    }

    public UserDetails residentialAddress3(String residentialAddress3) {
        this.residentialAddress3 = residentialAddress3;
        return this;
    }

    public void setResidentialAddress3(String residentialAddress3) {
        this.residentialAddress3 = residentialAddress3;
    }

    public String getResidentialAddress4() {
        return residentialAddress4;
    }

    public UserDetails residentialAddress4(String residentialAddress4) {
        this.residentialAddress4 = residentialAddress4;
        return this;
    }

    public void setResidentialAddress4(String residentialAddress4) {
        this.residentialAddress4 = residentialAddress4;
    }

    public Integer getMailingPostalCode() {
        return mailingPostalCode;
    }

    public UserDetails mailingPostalCode(Integer mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
        return this;
    }

    public void setMailingPostalCode(Integer mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
    }

    public String getMailingUnitNo() {
        return mailingUnitNo;
    }

    public UserDetails mailingUnitNo(String mailingUnitNo) {
        this.mailingUnitNo = mailingUnitNo;
        return this;
    }

    public void setMailingUnitNo(String mailingUnitNo) {
        this.mailingUnitNo = mailingUnitNo;
    }

    public String getMailingAddress1() {
        return mailingAddress1;
    }

    public UserDetails mailingAddress1(String mailingAddress1) {
        this.mailingAddress1 = mailingAddress1;
        return this;
    }

    public void setMailingAddress1(String mailingAddress1) {
        this.mailingAddress1 = mailingAddress1;
    }

    public String getMailingAddress2() {
        return mailingAddress2;
    }

    public UserDetails mailingAddress2(String mailingAddress2) {
        this.mailingAddress2 = mailingAddress2;
        return this;
    }

    public void setMailingAddress2(String mailingAddress2) {
        this.mailingAddress2 = mailingAddress2;
    }

    public String getMailingAddress3() {
        return mailingAddress3;
    }

    public UserDetails mailingAddress3(String mailingAddress3) {
        this.mailingAddress3 = mailingAddress3;
        return this;
    }

    public void setMailingAddress3(String mailingAddress3) {
        this.mailingAddress3 = mailingAddress3;
    }

    public String getMailingAddress4() {
        return mailingAddress4;
    }

    public UserDetails mailingAddress4(String mailingAddress4) {
        this.mailingAddress4 = mailingAddress4;
        return this;
    }

    public void setMailingAddress4(String mailingAddress4) {
        this.mailingAddress4 = mailingAddress4;
    }

    public String getOccupation() {
        return occupation;
    }

    public UserDetails occupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public UserDetails residentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
        return this;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public String getNationality() {
        return nationality;
    }

    public UserDetails nationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public UserDetails countryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
        return this;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getNameOfEmployer() {
        return nameOfEmployer;
    }

    public UserDetails nameOfEmployer(String nameOfEmployer) {
        this.nameOfEmployer = nameOfEmployer;
        return this;
    }

    public void setNameOfEmployer(String nameOfEmployer) {
        this.nameOfEmployer = nameOfEmployer;
    }

    public Float getAnnualIncome() {
        return annualIncome;
    }

    public UserDetails annualIncome(Float annualIncome) {
        this.annualIncome = annualIncome;
        return this;
    }

    public void setAnnualIncome(Float annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getAddressType() {
        return addressType;
    }

    public UserDetails addressType(String addressType) {
        this.addressType = addressType;
        return this;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public UserDetails maritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getUinfin() {
        return uinfin;
    }

    public UserDetails uinfin(String uinfin) {
        this.uinfin = uinfin;
        return this;
    }

    public void setUinfin(String uinfin) {
        this.uinfin = uinfin;
    }

    public MyInfoStatus getMyInfoVerified() {
        return myInfoVerified;
    }

    public UserDetails myInfoVerified(MyInfoStatus myInfoVerified) {
        this.myInfoVerified = myInfoVerified;
        return this;
    }

    public void setMyInfoVerified(MyInfoStatus myInfoVerified) {
        this.myInfoVerified = myInfoVerified;
    }

}
