package xyz.rl2jy.order.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("TF_F_USER")
public class User {
    @TableField(value = "PARTITION_ID")
    private Long partitionId;

    @TableId(value = "USER_ID")
    private Long userId;

    @TableField(value = "CUST_ID")
    private Long custId;

    @TableField(value = "USECUST_ID")
    private Long usecustId;

    @TableField(value = "EPARCHY_CODE")
    private String eparchyCode;

    @TableField(value = "CITY_CODE")
    private String cityCode;

    @TableField(value = "CITY_CODE_A")
    private String cityCodeA;

    @TableField(value = "USER_PASSWD")
    private String userPasswd;

    @TableField(value = "USER_DIFF_CODE")
    private String userDiffCode;

    @TableField(value = "USER_TYPE_CODE")
    private String userTypeCode;

    @TableField(value = "USER_TAG_SET")
    private String userTagSet;

    @TableField(value = "USER_STATE_CODESET")
    private String userStateCodeset;

    @TableField(value = "NET_TYPE_CODE")
    private String netTypeCode;

    @TableField(value = "SERIAL_NUMBER")
    private String serialNumber;

    @TableField(value = "CONTRACT_ID")
    private String contractId;

    @TableField(value = "ACCT_TAG")
    private String acctTag;

    @TableField(value = "PREPAY_TAG")
    private String prepayTag;

    @TableField(value = "MPUTE_MONTH_FEE")
    private String mputeMonthFee;

    @TableField(value = "MPUTE_DATE")
    private LocalDateTime mputeDate;

    @TableField(value = "FIRST_CALL_TIME")
    private LocalDateTime firstCallTime;

    @TableField(value = "LAST_STOP_TIME")
    private LocalDateTime lastStopTime;

    @TableField(value = "CHANGEUSER_DATE")
    private LocalDateTime changeuserDate;

    @TableField(value = "IN_NET_MODE")
    private String inNetMode;

    @TableField(value = "IN_DATE")
    private LocalDateTime inDate;

    @TableField(value = "IN_STAFF_ID")
    private String inStaffId;

    @TableField(value = "IN_DEPART_ID")
    private String inDepartId;

    @TableField(value = "OPEN_MODE")
    private String openMode;

    @TableField(value = "OPEN_DATE")
    private LocalDateTime openDate;

    @TableField(value = "OPEN_STAFF_ID")
    private String openStaffId;

    @TableField(value = "OPEN_DEPART_ID")
    private String openDepartId;

    @TableField(value = "DEVELOP_STAFF_ID")
    private String developStaffId;

    @TableField(value = "DEVELOP_DATE")
    private LocalDateTime developDate;

    @TableField(value = "DEVELOP_DEPART_ID")
    private String developDepartId;

    @TableField(value = "DEVELOP_CITY_CODE")
    private String developCityCode;

    @TableField(value = "DEVELOP_EPARCHY_CODE")
    private String developEparchyCode;

    @TableField(value = "DEVELOP_NO")
    private String developNo;

    @TableField(value = "ASSURE_CUST_ID")
    private Long assureCustId;

    @TableField(value = "ASSURE_TYPE_CODE")
    private String assureTypeCode;

    @TableField(value = "ASSURE_DATE")
    private LocalDateTime assureDate;

    @TableField(value = "REMOVE_TAG")
    private String removeTag;

    @TableField(value = "PRE_DESTROY_TIME")
    private LocalDateTime preDestroyTime;

    @TableField(value = "DESTROY_TIME")
    private LocalDateTime destroyTime;

    @TableField(value = "REMOVE_EPARCHY_CODE")
    private String removeEparchyCode;

    @TableField(value = "REMOVE_CITY_CODE")
    private String removeCityCode;

    @TableField(value = "REMOVE_DEPART_ID")
    private String removeDepartId;

    @TableField(value = "REMOVE_REASON_CODE")
    private String removeReasonCode;

    @TableField(value = "UPDATE_TIME", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @TableField(value = "UPDATE_STAFF_ID", fill = FieldFill.INSERT_UPDATE)
    private String updateStaffId;

    @TableField(value = "UPDATE_DEPART_ID", fill = FieldFill.INSERT_UPDATE)
    private String updateDepartId;

    @TableField(value = "REMARK")
    private String remark;

    @TableField(value = "RSRV_NUM1")
    private Long rsrvNum1;

    @TableField(value = "RSRV_NUM2")
    private Long rsrvNum2;

    @TableField(value = "RSRV_NUM3")
    private Long rsrvNum3;

    @TableField(value = "RSRV_NUM4")
    private Long rsrvNum4;

    @TableField(value = "RSRV_NUM5")
    private Long rsrvNum5;

    @TableField(value = "RSRV_STR1")
    private String rsrvStr1;

    @TableField(value = "RSRV_STR2")
    private String rsrvStr2;

    @TableField(value = "RSRV_STR3")
    private String rsrvStr3;

    @TableField(value = "RSRV_STR4")
    private String rsrvStr4;

    @TableField(value = "RSRV_STR5")
    private String rsrvStr5;

    @TableField(value = "RSRV_STR6")
    private String rsrvStr6;

    @TableField(value = "RSRV_STR7")
    private String rsrvStr7;

    @TableField(value = "RSRV_STR8")
    private String rsrvStr8;

    @TableField(value = "RSRV_STR9")
    private String rsrvStr9;

    @TableField(value = "RSRV_STR10")
    private String rsrvStr10;

    @TableField(value = "RSRV_DATE1")
    private LocalDateTime rsrvDate1;

    @TableField(value = "RSRV_DATE2")
    private LocalDateTime rsrvDate2;

    @TableField(value = "RSRV_DATE3")
    private LocalDateTime rsrvDate3;

    @TableField(value = "RSRV_TAG1")
    private String rsrvTag1;

    @TableField(value = "RSRV_TAG2")
    private String rsrvTag2;

    @TableField(value = "RSRV_TAG3")
    private String rsrvTag3;

    @TableField(value = "CREDIT_CONTROL_ID_J2EE")
    private String creditControlIdJ2ee;

    @TableField(value = "BASIC_CREDIT_VALUE_J2EE")
    private String basicCreditValueJ2ee;
}
