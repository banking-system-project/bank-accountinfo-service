package com.bank.account.info.dto;

public class UpdateSavingsInfoInputDTO {
    private String cifId;
    private String ifscCode;
    private String isSaving;
    private String smId;
    private String accountNumber;
    private String aadhaar;

    public String getCifId() {
        return cifId;
    }

    public void setCifId(String cifId) {
        this.cifId = cifId;
    }

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

    public String getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(String aadhaar) {
        this.aadhaar = aadhaar;
    }
}
