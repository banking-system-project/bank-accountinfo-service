package com.bank.account.info.util;

import com.bank.account.info.dto.*;
import com.bank.account.info.vo.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperUtil {
    public GetAccountInfoOutputDTO getAccountInfoOutputVOtoDTO (GetAccountInfoOutputVO getAccountInfoOutputVO);
    public GetAccountInfoOutputVO getAccountInfoOutputDTOtoVO (GetAccountInfoOutputDTO getAccountInfoOutputDTO);
    public UpdateJointStatusInputDTO updateJointStatusInputVOtoDTO(UpdateJointStatusInputVO updateJointStatusInputVO);
    public UpdateJointStatusInputVO updateJointStatusInputDTOtoVO(UpdateJointStatusInputDTO updateJointStatusInputDTO);
    public UpdateSavingsInfoInputDTO updateSavingsInfoInputVOtoDTO(UpdateSavingsInfoInputVO updateSavingsInfoInputVO);
    public UpdateSavingsInfoInputVO updateSavingsInfoInputDTOtoVO(UpdateSavingsInfoInputDTO updateSavingsInfoInputDTO);
    public GetCustomerJointInfoOutputDTO getCustomerJointInfoOutputVOtoDTO(GetCustomerJointInfoOutputVO getCustomerJointInfoOutputVO);
    public GetCustomerJointInfoOutputVO getCustomerJointInfoOutputDTOtoVO(GetCustomerJointInfoOutputDTO getCustomerJointInfoOutputDTO);
    public GetCustomerSavingsInfoOutputDTO getCustomerSavingsInfoOutputVOtoDTO(GetCustomerSavingsInfoOutputVO getCustomerSavingsInfoOutputVO);
    public GetCustomerSavingsInfoOutputVO getCustomerSavingsInfoOutputDTOtoVO(GetCustomerSavingsInfoOutputDTO getCustomerSavingsInfoOutputDTO);
}
