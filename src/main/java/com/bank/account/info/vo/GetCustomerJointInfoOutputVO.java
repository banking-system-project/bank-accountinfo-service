package com.bank.account.info.vo;

public class GetCustomerJointInfoOutputVO {

    private String ifscCode;
    private String isJoint;
    private String jointId;


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
