package com.melotic.klerring.entity;

import com.melotic.klerring.base.BaseEntity;

/**
 * Created by penghui on 15/9/24.
 bank = "\U4e2d\U56fd\U5de5\U5546\U94f6\U884c\Uff0801020000\Uff09";
 bankcode = ICBC;
 card = 6222020200014680801;
 cardname = "";
 city = "\U5317\U4eac";
 province = "\U5317\U4eac";
 tel = 95588;
 type = "\U501f\U8bb0\U5361";
 */
public class BankInfoEntity extends BaseEntity{
    private String bank;
    private String bankcode;
    private String card;
    private String cardname;
    private String city;
    private String province;
    private String tel;
    private String type;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
