package com.bank.account.info.eo;

import com.bank.account.info.dao.BankAccountInfoDAO;
import com.bank.account.info.dto.GetAccountInfoOutputDTO;
import com.bank.account.info.dto.GetCustomerJointInfoOutputDTO;
import com.bank.account.info.dto.GetCustomerSavingsInfoOutputDTO;
import com.bank.account.info.util.MapperUtil;
import com.bank.account.info.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankAccountInfoEO {

    @Autowired
    public BankAccountInfoDAO bankAccountInfoDAO;

    private static final Logger logger = LoggerFactory.getLogger(BankAccountInfoEO.class);

    @Autowired
    public MapperUtil mapperUtil;

    public GetAccountInfoOutputVO getAccountDetailsByCif(AccountInfoInputVO accountInfoInputVO){
        logger.info("EO layer: beginning of getAccountDetailsByCif");
        GetAccountInfoOutputDTO getAccountInfoOutputDTO = bankAccountInfoDAO.getAccountDetailsByCif(accountInfoInputVO);
        logger.info("EO layer: ending of getAccountDetailsByCif");
        return  mapperUtil.getAccountInfoOutputDTOtoVO(getAccountInfoOutputDTO);
    }

    public GetCustomerJointInfoOutputVO getCustomerJointInfoByCif(AccountInfoInputVO accountInfoInputVO) {
        logger.info("EO layer: beginning of getCustomerJointInfoByCif");
        GetCustomerJointInfoOutputDTO getCustomerJointInfoOutputDTO = bankAccountInfoDAO.getCustomerJointInfoByCIF(accountInfoInputVO);
        logger.info("EO layer: ending of getCustomerJointInfoByCif");
        return mapperUtil.getCustomerJointInfoOutputDTOtoVO(getCustomerJointInfoOutputDTO);
    }

    public GetCustomerSavingsInfoOutputVO getCustomerSavingsInfoByCif(AccountInfoInputVO accountInfoInputVO) {
        logger.info("EO layer: beginning of getCustomerSavingsInfoByCif");
        GetCustomerSavingsInfoOutputDTO getCustomerSavingsInfoOutputDTO = bankAccountInfoDAO.getCustomerSavingsInfoByCif(accountInfoInputVO);
        logger.info("EO layer: ending of getCustomerSavingsInfoByCif");
        return mapperUtil.getCustomerSavingsInfoOutputDTOtoVO(getCustomerSavingsInfoOutputDTO);
    }

}
