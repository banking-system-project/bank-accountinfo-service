package com.bank.account.info.vo;

public class GetCustomerSavingsInfoOutputVO {
    private String ifscCode;
    private String isSaving;
    private String smId;
    private String accountNumber;

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getIsSaving() {
        return isSaving;
    }

    public void setIsSaving(String isSaving) {
        this.isSaving = isSaving;
    }

    public String getSmId() {
        return smId;
    }

    public void setSmId(String smId) {
        this.smId = smId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
