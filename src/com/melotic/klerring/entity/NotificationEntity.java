package com.melotic.klerring.entity;

import com.melotic.klerring.base.BaseEntity;

/**
 * 通知列表实体
 * Created by penghui on 15/9/23.
 @property (nonatomic,strong) NSString *activityId;
 @property (nonatomic,strong) NSString *notificationId;
 @property (nonatomic,strong) NSString *message;
 @property (nonatomic,strong) NSString *title;
 @property (nonatomic,strong) NSString *imageURL;

 @property (nonatomic,assign) NSInteger read;
 @property (nonatomic,assign) NSInteger activityType;
 @property (nonatomic,assign) double createdAt;
 */
public class NotificationEntity extends BaseEntity {
    private String activityId;
    private String notificationId;
    private String message;
    private String title;
    private String imageURL;
    private int read;
    private int activityType;
    private double createdAt;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public int getActivityType() {
        return activityType;
    }

    public void setActivityType(int activityType) {
        this.activityType = activityType;
    }

    public double getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(double createdAt) {
        this.createdAt = createdAt;
    }
}
