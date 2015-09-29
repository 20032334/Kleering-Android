package com.melotic.klerring.entity;

import com.melotic.klerring.base.BaseEntity;

/**
 * Created by penghui on 15/9/23.
 @property (nonatomic,strong) NSString *contractId;

 @property (nonatomic,strong) NSString *firstName;
 @property (nonatomic,strong) NSString *pinyinFirstName;

 @property (nonatomic,strong) NSString *lastName;
 @property (nonatomic,strong) NSString *pinyinLastName;

 @property (nonatomic,strong) NSString *phoneCountryCode;
 @property (nonatomic,strong) NSString *phoneNumber;

 @property (nonatomic,strong) NSString *localIcon;
 @property (nonatomic,strong) NSString *remoteIcon;

 @property (nonatomic, strong) NSString *firstLetter;
 */
public class ContractEntity extends BaseEntity {
    private String contractId;
    private String firstName;
    private String pinyinFirstName;
    private String lastName;
    private String pinyinLastName;
    private String phoneCountryCode;
    private String phoneNumber;
    private String localIcon;
    private String remoteIcon;
    private String firstLetter;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPinyinFirstName() {
        return pinyinFirstName;
    }

    public void setPinyinFirstName(String pinyinFirstName) {
        this.pinyinFirstName = pinyinFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPinyinLastName() {
        return pinyinLastName;
    }

    public void setPinyinLastName(String pinyinLastName) {
        this.pinyinLastName = pinyinLastName;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocalIcon() {
        return localIcon;
    }

    public void setLocalIcon(String localIcon) {
        this.localIcon = localIcon;
    }

    public String getRemoteIcon() {
        return remoteIcon;
    }

    public void setRemoteIcon(String remoteIcon) {
        this.remoteIcon = remoteIcon;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }
}
