package com.bank.account.info.dao;

import com.bank.account.info.dto.*;
import com.bank.account.info.mapper.*;
import com.bank.account.info.util.SqlQueriesConstants;
import com.bank.account.info.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BankAccountInfoDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private GetAccountInfoSpecificMapper getAccountInfoSpecificMapper;
    @Autowired
    private GetJointInfoMapper getJointInfoMapper;
    @Autowired
    private GetSavingsInfoMapper getSavingsInfoMapper;


    private static final Logger logger = LoggerFactory.getLogger(BankAccountInfoDAO.class);

    public GetAccountInfoOutputDTO getAccountDetailsByCif(AccountInfoInputVO accountInfoInputVO){
        GetAccountInfoOutputDTO getAccountInfoOutputDTO = null;
        logger.info("DAO Layer: Calling DB initiated for fetching specific account details");
        try{
            getAccountInfoOutputDTO = (GetAccountInfoOutputDTO) jdbcTemplate.queryForObject(SqlQueriesConstants.SQL_GET_SPECIFIC_ACCOUNT_DETAILS,getAccountInfoSpecificMapper, new Object[]{accountInfoInputVO.getCifId(),accountInfoInputVO.getAadharNo()});
            logger.info("DAO Layer: returning from DB post account fetching");
        } catch (Exception e) {
            logger.error("DAO Layer: Exception while fetching specific account from DB");
            throw new RuntimeException(e);
        }
        return  getAccountInfoOutputDTO;
    }


    public GetCustomerJointInfoOutputDTO getCustomerJointInfoByCIF(AccountInfoInputVO accountInfoInputVO) {
        GetCustomerJointInfoOutputDTO getCustomerJointInfoOutputDTO = null;
        logger.info("DAO Layer: calling DB initiated for fetching joint account info");
        try{
            getCustomerJointInfoOutputDTO = (GetCustomerJointInfoOutputDTO) jdbcTemplate.queryForObject(SqlQueriesConstants.SQL_GET_JOINT_INFO_BY_IFSC_CODE,getJointInfoMapper, new Object[]{accountInfoInputVO.getCifId(),accountInfoInputVO.getAadharNo()});
            logger.info("DAO Layer: returning from DB after getting joint info by ifsc code");
        }catch (Exception e) {
            logger.error("DAO Layer: Exception while fetching joint account info from DB");
            throw new RuntimeException(e);
        }
        return  getCustomerJointInfoOutputDTO;
    }

    public GetCustomerSavingsInfoOutputDTO getCustomerSavingsInfoByCif(AccountInfoInputVO accountInfoInputVO) {
        GetCustomerSavingsInfoOutputDTO getCustomerSavingsInfoOutputDTO = null;
        logger.info("DAO Layer: calling DB initiated for fetching savings account info");
        try{
            getCustomerSavingsInfoOutputDTO = (GetCustomerSavingsInfoOutputDTO) jdbcTemplate.queryForObject(SqlQueriesConstants.SQL_GET_SAVINGS_ACCOUNT_BY_IFSC_CODE, getSavingsInfoMapper, new Object[]{accountInfoInputVO.getCifId(),accountInfoInputVO.getAadharNo()});
            logger.info("DAO Layer: returning from DB after getting savings info by ifsc code");
        }catch(Exception e){
            logger.error("DAO Layer: Exception while fetching savings account info from DB");
            throw new RuntimeException(e);
        }
        return getCustomerSavingsInfoOutputDTO;
    }



}
