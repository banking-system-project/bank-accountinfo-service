package com.bank.account.info.mapper;

import com.bank.account.info.vo.GetSavingsExistVO;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class SavingsExistMapper implements RowMapper {
    public GetSavingsExistVO mapRow(ResultSet rs, int rowNo) throws SQLException {
        GetSavingsExistVO getSavingsExistVO = new GetSavingsExistVO();
        getSavingsExistVO.setIsSavings(rs.getString("is_savings"));
        getSavingsExistVO.setExistsInSavings(rs.getString("exists_in_savings"));

        return getSavingsExistVO;
    }
}
