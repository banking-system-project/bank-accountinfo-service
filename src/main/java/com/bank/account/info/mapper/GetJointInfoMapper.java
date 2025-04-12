package com.bank.account.info.mapper;

import com.bank.account.info.dto.GetCustomerJointInfoOutputDTO;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class GetJointInfoMapper implements RowMapper {
    public GetCustomerJointInfoOutputDTO mapRow(ResultSet rs, int rowNo) throws SQLException{
        GetCustomerJointInfoOutputDTO getCustomerJointInfoOutputDTO = new GetCustomerJointInfoOutputDTO();
        getCustomerJointInfoOutputDTO.setIfscCode(rs.getString("IFSC_CODE"));
        getCustomerJointInfoOutputDTO.setIsJoint(rs.getString("IS_JOINT"));
        getCustomerJointInfoOutputDTO.setJointId(rs.getString("JOINT_ID"));

        return getCustomerJointInfoOutputDTO;
    }
}
