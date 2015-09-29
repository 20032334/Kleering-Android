package com.melotic.klerring.entity;

import com.melotic.klerring.base.BaseEntity;

/**
 * Created by penghui on 15/9/23.
 @property (nonatomic,strong) NSArray *accounts;

 @property (nonatomic,strong) NSString *avatarURL;

 @property (nonatomic,strong) NSString *firstName;
 @property (nonatomic,strong) NSString *lastName;
 @property (nonatomic,strong) NSString *email;
 @property (nonatomic,strong) NSString *phoneNumber;
 @property (nonatomic,strong) NSString *countryCode;
 @property (nonatomic,strong) NSString *countryCode1;
 @property (nonatomic,strong) NSString *password;
 @property (nonatomic,strong) NSString *level;
 @property (nonatomic,strong) NSString *state;

 @property (nonatomic,strong) NSString *token;
 @property (nonatomic,strong) NSNumber *ttl;
 @property (nonatomic,strong) NSString *created;
 @property (nonatomic,strong) NSString *userid;
 @property (nonatomic,assign) NSInteger usePin;
 */
public class UserEntity extends BaseEntity {
    private String avatarURL;

    private String firstName;
    private String lastName;

    private String email;
    private String phoneNumber;
    private String countryCode;
    private String countryCode1;
    private String password;
    private String level;
    private String state;

    private String token;
    private String ttl;
    private String created;
    private String userid;
    private int usePin;

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode1() {
        return countryCode1;
    }

    public void setCountryCode1(String countryCode1) {
        this.countryCode1 = countryCode1;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getUsePin() {
        return usePin;
    }

    public void setUsePin(int usePin) {
        this.usePin = usePin;
    }
}
