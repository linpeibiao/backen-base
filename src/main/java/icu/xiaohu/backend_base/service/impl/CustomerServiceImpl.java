package icu.xiaohu.backend_base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.xiaohu.backend_base.model.entity.Customer;
import icu.xiaohu.backend_base.service.CustomerService;
import icu.xiaohu.backend_base.mapper.CustomerMapper;
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




