package com.bank.account.info.service;

import com.bank.account.info.vo.*;


public interface BankAccountInfoService {
    public GetAccountInfoOutputVO getAccountDetailsByCif(AccountInfoInputVO accountInfoInputVO);
    public GetCustomerJointInfoOutputVO getCustomerJointInfoByCif(AccountInfoInputVO accountInfoInputVO);
    public GetCustomerSavingsInfoOutputVO getCustomerSavingsInfoByCif(AccountInfoInputVO accountInfoInputVO);

}
