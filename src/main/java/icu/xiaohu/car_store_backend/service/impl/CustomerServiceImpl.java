package icu.xiaohu.car_store_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.xiaohu.car_store_backend.model.entity.Customer;
import icu.xiaohu.car_store_backend.service.CustomerService;
import icu.xiaohu.car_store_backend.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

/**
* @author xiaohu
* @description 针对表【tb_customer】的数据库操作Service实现
* @createDate 2023-04-21 18:00:23
*/
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer>
    implements CustomerService{

}




