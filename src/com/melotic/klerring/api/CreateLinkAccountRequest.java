package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.base.BaseResponse;

/**
 * Created by penghui on 15/9/23.
 *
 #define Bank_Account_Number @"accountNumber"
 #define Bank_Confirm_Account_Number @"confirmAccountNumber"
 #define Beneficiary_Name @"beneficiaryName"
 #define Bank_Nick_Name @"accountNickname"

 #define Bank_Name @"bankName"
 #define Bank_Branch_Name @"branchName"

 #define Bank_Number @"bankNumber"
 #define Bank_Branch_Number @"branchNumber"

 #define Bank_City @"city"
 #define Bank_Province @"province"

 #define Currency_Code @"currencyCode"
 */
public class CreateLinkAccountRequest extends BaseRequest {
    private int type;
    private String accountNumber;
    private String confirmAccountNumber;

    private String beneficiaryName;
    private String accountNickname;

    private String bankName;
    private String branchName;

    private String bankNumber;
    private String branchNumber;

    private String city;
    private String province;
    private String currencyCode;

    @Override
    public String resourceName() {
        if (type == 0) {
            return "/api/cnybanklinkedaccounts/create";
        }
        else{
            return "/api/twdbanklinkedaccounts/create";
        }
    }

    @Override
    public Class getResponseClass() {
        return BaseResponse.class;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getConfirmAccountNumber() {
        return confirmAccountNumber;
    }

    public void setConfirmAccountNumber(String confirmAccountNumber) {
        this.confirmAccountNumber = confirmAccountNumber;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getAccountNickname() {
        return accountNickname;
    }

    public void setAccountNickname(String accountNickname) {
        this.accountNickname = accountNickname;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(String branchNumber) {
        this.branchNumber = branchNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
