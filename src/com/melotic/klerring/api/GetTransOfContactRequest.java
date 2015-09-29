package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.TransactionEntity;

/**
 * Created by penghui on 15/9/24.
 */
public class GetTransOfContactRequest extends BaseRequest{
    private String contactId;
    @Override
    public String resourceName() {
        return "/api/payments/contact/" + contactId;
    }

    @Override
    public Class getResponseClass() {
        return TransactionEntity.class;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }
}
