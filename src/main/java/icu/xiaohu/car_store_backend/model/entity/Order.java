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
 * @TableName tb_order
 */
@TableName(value ="tb_order")
@Data
public class Order implements Serializable {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 客户id
     */
    private Long customerId;

    /**
     * 车辆id
     */
    private Long carId;

    /**
     * 销售人员id
     */
    private Long salesmanId;

    /**
     * 订单金额
     */
    private BigDecimal price;

    /**
     * 订单类型
     */
    private String type;

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

    /**
     * 乐观锁
     */
    private Integer version;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}