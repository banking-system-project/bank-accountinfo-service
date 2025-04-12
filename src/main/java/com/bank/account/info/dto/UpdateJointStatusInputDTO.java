package com.bank.account.info.dto;

public class UpdateJointStatusInputDTO {
    private String cifId;
    private String ifscCode;
    private String isJoint;
    private String jointId;
    private String aadhaar;

    public String getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(String aadhaar) {
        this.aadhaar = aadhaar;
    }

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

    public String getIsJoint() {
        return isJoint;
    }

    public void setIsJoint(String isJoint) {
        this.isJoint = isJoint;
    }

    public String getJointId() {
        return jointId;
    }

    public void setJointId(String jointId) {
        this.jointId = jointId;
    }
}
