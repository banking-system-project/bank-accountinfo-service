package com.bank.account.info.controller;


import com.bank.account.info.service.BankAccountInfoServiceImpl;
import com.bank.account.info.vo.AccountInfoInputVO;
import com.bank.account.info.vo.GetAccountInfoOutputVO;
import com.bank.account.info.vo.GetCustomerJointInfoOutputVO;
import com.bank.account.info.vo.GetCustomerSavingsInfoOutputVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/bank/account/info")
public class BankAccountInfoController {

    @Autowired
    BankAccountInfoServiceImpl bankAccountInfoService;

    private static final Logger logger = LoggerFactory.getLogger(BankAccountInfoController.class);


    @PostMapping("/getAccountByCif")
    public ResponseEntity<Object> getAccountDetailsByCif(@RequestBody AccountInfoInputVO accountInfoInputVO){
        logger.info("Controller Layer: beginning of getAccountDetailsByCif");
        GetAccountInfoOutputVO accountInfoOutputVO = bankAccountInfoService.getAccountDetailsByCif(accountInfoInputVO);
        logger.info("Controller Layer: ending of getAccountDetailsByCif");
        return new ResponseEntity<>(accountInfoOutputVO, HttpStatus.OK);
    }

    @PostMapping("/getCustomerJointInfo")
    public ResponseEntity<GetCustomerJointInfoOutputVO> getCustomerJointInfoByCif(@RequestBody AccountInfoInputVO accountInfoInputVO) {
        logger.info("Controller Layer: beginning of getCustomerJointInfoByCif");
        GetCustomerJointInfoOutputVO getCustomerJointInfoOutputVO =  bankAccountInfoService.getCustomerJointInfoByCif(accountInfoInputVO);
        logger.info("Controller layer: ending of getCustomerJointInfoByCif");
        return new ResponseEntity<>(getCustomerJointInfoOutputVO,HttpStatus.OK );
    }

    @PostMapping("/getCustomerSavingsInfo")
    public ResponseEntity<GetCustomerSavingsInfoOutputVO> getCustomerSavingsInfoByCif(@RequestBody AccountInfoInputVO accountInfoInputVO) {
        logger.info("Controller Layer: beginning of getCustomerSavingsInfoByCif");
        GetCustomerSavingsInfoOutputVO getCustomerSavingsInfoOutputVO =  bankAccountInfoService.getCustomerSavingsInfoByCif(accountInfoInputVO);
        logger.info("Controller layer: ending of getCustomerSavingsInfoByCif");
        return new ResponseEntity<>(getCustomerSavingsInfoOutputVO,HttpStatus.OK );
    }

}
