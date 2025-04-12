package com.bank.account.info.mapper;

import com.bank.account.info.dto.GetCustomerSavingsInfoOutputDTO;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class GetSavingsInfoMapper implements RowMapper {
    public GetCustomerSavingsInfoOutputDTO mapRow(ResultSet rs, int rowNo) throws SQLException{
        GetCustomerSavingsInfoOutputDTO getCustomerSavingsInfoOutputDTO = new GetCustomerSavingsInfoOutputDTO();
        getCustomerSavingsInfoOutputDTO.setIfscCode(rs.getString("IFSC_CODE"));
        getCustomerSavingsInfoOutputDTO.setIsSaving(rs.getString("IS_SAVINGS"));
        getCustomerSavingsInfoOutputDTO.setSmId(rs.getString("SM_ID"));
        getCustomerSavingsInfoOutputDTO.setAccountNumber(rs.getString("ACCOUNT_NO"));

        return getCustomerSavingsInfoOutputDTO;

    }
}
