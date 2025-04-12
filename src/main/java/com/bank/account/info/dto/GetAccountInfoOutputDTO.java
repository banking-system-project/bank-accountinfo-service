package com.bank.account.info.dto;

import com.bank.account.info.vo.*;

public class GetAccountInfoOutputDTO {
    private BankCredDetailsVO bankCredDetailsVO;
    private UserDemographicInfoVO userDemographicInfoVO;
    private UserOfficialInfoVO userOfficialInfoVO;
    private UserAddressInfoVO userAddressInfoVO;
    private UserProfessionalInfoVO userProfessionalInfoVO;

    public BankCredDetailsVO getBankCredDetailsVO() {
        return bankCredDetailsVO;
    }

    public void setBankCredDetailsVO(BankCredDetailsVO bankCredDetailsVO) {
        this.bankCredDetailsVO = bankCredDetailsVO;
    }

    public UserDemographicInfoVO getUserDemographicInfoVO() {
        return userDemographicInfoVO;
    }

    public void setUserDemographicInfoVO(UserDemographicInfoVO userDemographicInfoVO) {
        this.userDemographicInfoVO = userDemographicInfoVO;
    }

    public UserOfficialInfoVO getUserOfficialInfoVO() {
        return userOfficialInfoVO;
    }

    public void setUserOfficialInfoVO(UserOfficialInfoVO userOfficialInfoVO) {
        this.userOfficialInfoVO = userOfficialInfoVO;
    }

    public UserProfessionalInfoVO getUserProfessionalInfoVO() {
        return userProfessionalInfoVO;
    }

    public void setUserProfessionalInfoVO(UserProfessionalInfoVO userProfessionalInfoVO) {
        this.userProfessionalInfoVO = userProfessionalInfoVO;
    }

    public UserAddressInfoVO getUserAddressInfoVO() {
        return userAddressInfoVO;
    }

    public void setUserAddressInfoVO(UserAddressInfoVO userAddressInfoVO) {
        this.userAddressInfoVO = userAddressInfoVO;
    }

    @Override
    public String toString() {
        return "GetAccountInfoOutputDTO{" +
                "bankCredDetailsVO=" + bankCredDetailsVO +
                ", userDemographicInfoVO=" + userDemographicInfoVO +
                ", userOfficialInfoVO=" + userOfficialInfoVO +
                ", userAddressInfoVO=" + userAddressInfoVO +
                ", userProfessionalInfoVO=" + userProfessionalInfoVO +
                '}';
    }
}
