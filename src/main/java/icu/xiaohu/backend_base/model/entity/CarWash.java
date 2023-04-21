package icu.xiaohu.backend_base.model.entity;

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
 * @TableName tb_car_wash
 */
@TableName(value ="tb_car_wash")
@Data
public class CarWash implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Object id;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 客户id
     */
    private Object customerId;

    /**
     * 汽车id
     */
    private Object carId;

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