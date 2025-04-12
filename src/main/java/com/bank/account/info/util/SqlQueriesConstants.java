package com.bank.account.info.util;

public class SqlQueriesConstants {
    public static final String SQL_GET_SPECIFIC_ACCOUNT_DETAILS = "select * from crmuser_accounts where cif_id = ? and aadhaar_no = ?";

    public static final String SQL_GET_SAVINGS_ACCOUNT_BY_IFSC_CODE =   "select is_savings, sa.ifsc_code, sa.sm_id, sa.account_no from crmuser_accounts ca, bank_savings_accounts sa \n" +
                                                                        "where  ca.cif_id = sa.cif_id\n" +
                                                                        "and ca.cif_id = ? \n" +
                                                                        "and ca.aadhaar_no = ?;";

    public static final String SQL_GET_JOINT_INFO_BY_IFSC_CODE = "select ifsc_code, is_joint, joint_id  \n" +
                                                    "from crmuser_accounts \n" +
                                                    "where cif_id = ? and aadhaar_no = ?";
}
