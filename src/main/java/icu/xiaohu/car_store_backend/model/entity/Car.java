package icu.xiaohu.car_store_backend.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName tb_car
 */
@TableName(value ="tb_car")
@Data
public class Car implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Object id;

    /**
     * 车牌
     */
    private String licensePlate;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;

    /**
     * 颜色
     */
    private String colour;

    /**
     * 购买日期
     */
    private Date buyTime;

    /**
     * 价格(单价万)
     */
    private BigDecimal price;

    /**
     * 客户id
     */
    private Object customerId;

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