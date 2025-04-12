package com.bank.account.info.mapper;

import com.bank.account.info.vo.AccountInfoOutputVO;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class GetAccountInfoOutputMapper implements RowMapper {
    public AccountInfoOutputVO mapRow(ResultSet rs, int rowNo) throws SQLException{
        AccountInfoOutputVO accountInfoOutputVO=new AccountInfoOutputVO();
        accountInfoOutputVO.setUser_id(rs.getString("USER_ID"));

        return accountInfoOutputVO;
    }
}
