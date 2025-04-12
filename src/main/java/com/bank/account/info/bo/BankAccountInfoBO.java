package com.bank.account.info.bo;

import com.bank.account.info.eo.BankAccountInfoEO;
import com.bank.account.info.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankAccountInfoBO {

    @Autowired
    public BankAccountInfoEO bankAccountInfoEO;

    private static final Logger logger = LoggerFactory.getLogger(BankAccountInfoBO.class);

    public GetAccountInfoOutputVO getAccountDetailsByCif(AccountInfoInputVO accountInfoInputVO){
        logger.info("BO layer: beginning of getAccountDetailsByCif");
        return bankAccountInfoEO.getAccountDetailsByCif(accountInfoInputVO);
    }

    public GetCustomerJointInfoOutputVO getCustomerJointInfoByCif(AccountInfoInputVO accountInfoInputVO) {
        logger.info("BO layer: beginning of getCustomerJointInfoByCif");
        return bankAccountInfoEO.getCustomerJointInfoByCif(accountInfoInputVO);
    }

    public GetCustomerSavingsInfoOutputVO getCustomerSavingsInfoByCif(AccountInfoInputVO accountInfoInputVO) {
        logger.info("BO layer: beginning of getCustomerSavingsInfoByCif");
        return bankAccountInfoEO.getCustomerSavingsInfoByCif(accountInfoInputVO);
    }

}
