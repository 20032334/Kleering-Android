package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.TokenEntity;

/**
 * Created by penghui on 15/9/23.
 */

//#define  Payment_Currency_Name @"payCurrencyName"
//        #define  Payment_Currency_Sign @"payCurrencySign"
//
//        #define  Payment_Payee_Currency_Name @"payPayeeCurrencyName"
//        #define  Payment_Payee_Currency_Sign @"payPayeeCurrencySign"
//
//        #define  Payment_PayerCurrencyAccountId @"payerCurrencyAccountId"
//        #define  Payment_PayeeId @"payeeEmail"//针对于send
//        #define  Payment_PayerId @"payerEmail"//针对于request
//        #define  Payment_Payer_Note @"payerNote"
//        #define  Payment_Payee_Note @"payeeNote"
//        #define  Payment_From_Amount @"fromAmount"
//        #define  Payment_To_Amount @"toAmount"
//        #define  Payment_Really_To_Amount @"realtoAmount"
//        #define  Payment_From_CurrencyId @"fromCurrencyCode"
//        #define  Payment_To_CurrencyId @"toCurrencyCode"
//
//        #define  Payment_Payee_Phone_Country_Code @"payeePhoneCountryCode"
//        #define  Payment_Payee_Phone_Number @"payeePhoneNumber"
//
//        #define  Payment_Payer_Phone_Country_Code @"payerPhoneCountryCode"
//        #define  Payment_Payer_Phone_Number @"payerPhoneNumber"
//
//        #define  Payment_ExchangeRate @"exchangeRate"
//
//        #define Payment_Pin_Code @"pinCode"

public class SendRequest extends BaseRequest{
    private String payCurrencyName;
    private String payCurrencySign;
    private String payPayeeCurrencyName;
    private String payPayeeCurrencySign;
    private String payerCurrencyAccountId;
    private String payeeEmail;
    private String payerEmail;
    private String payerNote;
    private String payeeNote;
    private String fromAmount;
    private String toAmount;
    private String realtoAmount;
    private String fromCurrencyCode;
    private String toCurrencyCode;
    private String payeePhoneCountryCode;
    private String payeePhoneNumber;
    private String payerPhoneCountryCode;
    private String payerPhoneNumber;
    private String exchangeRate;
    private String pinCode;

    public String getPayCurrencyName() {
        return payCurrencyName;
    }

    public void setPayCurrencyName(String payCurrencyName) {
        this.payCurrencyName = payCurrencyName;
    }

    public String getPayCurrencySign() {
        return payCurrencySign;
    }

    public void setPayCurrencySign(String payCurrencySign) {
        this.payCurrencySign = payCurrencySign;
    }

    public String getPayPayeeCurrencyName() {
        return payPayeeCurrencyName;
    }

    public void setPayPayeeCurrencyName(String payPayeeCurrencyName) {
        this.payPayeeCurrencyName = payPayeeCurrencyName;
    }

    public String getPayPayeeCurrencySign() {
        return payPayeeCurrencySign;
    }

    public void setPayPayeeCurrencySign(String payPayeeCurrencySign) {
        this.payPayeeCurrencySign = payPayeeCurrencySign;
    }

    public String getPayerCurrencyAccountId() {
        return payerCurrencyAccountId;
    }

    public void setPayerCurrencyAccountId(String payerCurrencyAccountId) {
        this.payerCurrencyAccountId = payerCurrencyAccountId;
    }

    public String getPayeeEmail() {
        return payeeEmail;
    }

    public void setPayeeEmail(String payeeEmail) {
        this.payeeEmail = payeeEmail;
    }

    public String getPayerEmail() {
        return payerEmail;
    }

    public void setPayerEmail(String payerEmail) {
        this.payerEmail = payerEmail;
    }

    public String getPayerNote() {
        return payerNote;
    }

    public void setPayerNote(String payerNote) {
        this.payerNote = payerNote;
    }

    public String getPayeeNote() {
        return payeeNote;
    }

    public void setPayeeNote(String payeeNote) {
        this.payeeNote = payeeNote;
    }

    public String getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(String fromAmount) {
        this.fromAmount = fromAmount;
    }

    public String getToAmount() {
        return toAmount;
    }

    public void setToAmount(String toAmount) {
        this.toAmount = toAmount;
    }

    public String getRealtoAmount() {
        return realtoAmount;
    }

    public void setRealtoAmount(String realtoAmount) {
        this.realtoAmount = realtoAmount;
    }

    public String getFromCurrencyCode() {
        return fromCurrencyCode;
    }

    public void setFromCurrencyCode(String fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    public String getToCurrencyCode() {
        return toCurrencyCode;
    }

    public void setToCurrencyCode(String toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }

    public String getPayeePhoneCountryCode() {
        return payeePhoneCountryCode;
    }

    public void setPayeePhoneCountryCode(String payeePhoneCountryCode) {
        this.payeePhoneCountryCode = payeePhoneCountryCode;
    }

    public String getPayeePhoneNumber() {
        return payeePhoneNumber;
    }

    public void setPayeePhoneNumber(String payeePhoneNumber) {
        this.payeePhoneNumber = payeePhoneNumber;
    }

    public String getPayerPhoneCountryCode() {
        return payerPhoneCountryCode;
    }

    public void setPayerPhoneCountryCode(String payerPhoneCountryCode) {
        this.payerPhoneCountryCode = payerPhoneCountryCode;
    }

    public String getPayerPhoneNumber() {
        return payerPhoneNumber;
    }

    public void setPayerPhoneNumber(String payerPhoneNumber) {
        this.payerPhoneNumber = payerPhoneNumber;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public Class getResponseClass() {
        return BaseRequest.class;
    }

    @Override
    public String resourceName() {
        return "/api/payments/send";
    }
}
