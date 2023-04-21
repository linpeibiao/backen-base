package icu.xiaohu.car_store_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.xiaohu.car_store_backend.model.entity.Order;
import icu.xiaohu.car_store_backend.service.OrderService;
import icu.xiaohu.car_store_backend.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author xiaohu
* @description 针对表【tb_order】的数据库操作Service实现
* @createDate 2023-04-21 18:00:23
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




