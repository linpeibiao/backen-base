package icu.xiaohu.backend_base.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName tb_customer
 */
@TableName(value ="tb_customer")
@Data
public class Customer implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Object id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 年龄
     */
    private Object age;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 已婚
     */
    private Boolean hasMarry;

    /**
     * 电话1
     */
    private String phone1;

    /**
     * 电话2
     */
    private String phone2;

    /**
     * 电话3
     */
    private String phone3;

    /**
     * 微信
     */
    private String wechat;

    /**
     * QQ
     */
    private String qq;

    /**
     * 其他联系人1
     */
    private String otherContacts1;

    /**
     * 其他联系人2
     */
    private String otherContacts2;

    /**
     * 住址
     */
    private String address;

    /**
     * 公司
     */
    private String company;

    /**
     * 公司地址
     */
    private String companyAddress;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 薪资
     */
    private String salary;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}