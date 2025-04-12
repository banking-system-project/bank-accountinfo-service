package com.bank.account.info.service;

import com.bank.account.info.bo.BankAccountInfoBO;
import com.bank.account.info.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountInfoServiceImpl implements BankAccountInfoService{

    private static final Logger logger = LoggerFactory.getLogger(BankAccountInfoServiceImpl.class);

    @Autowired
    public BankAccountInfoBO bankAccountInfoBO;

    @Override
    public GetAccountInfoOutputVO getAccountDetailsByCif(AccountInfoInputVO accountInfoInputVO){
        logger.info("Service Layer: beginning of getAccountDetailsByCif");
        return bankAccountInfoBO.getAccountDetailsByCif(accountInfoInputVO);
    }

    @Override
    public GetCustomerJointInfoOutputVO getCustomerJointInfoByCif(AccountInfoInputVO accountInfoInputVO) {
        logger.info("Service Layer: beginning of getCustomerJointInfoByCif");
        return bankAccountInfoBO.getCustomerJointInfoByCif(accountInfoInputVO);
    }

    @Override
    public GetCustomerSavingsInfoOutputVO getCustomerSavingsInfoByCif(AccountInfoInputVO accountInfoInputVO) {
        logger.info("Service Layer: beginning of getCustomerSavingsInfoByCif");
        return bankAccountInfoBO.getCustomerSavingsInfoByCif(accountInfoInputVO);
    }

}
