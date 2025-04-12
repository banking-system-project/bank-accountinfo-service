package com.bank.account.info.mapper;

import com.bank.account.info.vo.GetJointExistVO;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class JoinExistsMapper implements RowMapper {
    public GetJointExistVO mapRow(ResultSet rs, int rowNo) throws SQLException{
        GetJointExistVO getJointExistVO = new GetJointExistVO();
        getJointExistVO.setCaIsJoint(rs.getString("cja"));
        getJointExistVO.setSaIsJoint(rs.getString("sja"));
        return  getJointExistVO;
    }
}
