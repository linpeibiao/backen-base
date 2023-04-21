package icu.xiaohu.backend_base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.xiaohu.backend_base.model.entity.Car;
import icu.xiaohu.backend_base.service.CarService;
import icu.xiaohu.backend_base.mapper.CarMapper;
import org.springframework.stereotype.Service;

/**
* @author xiaohu
* @description 针对表【tb_car】的数据库操作Service实现
* @createDate 2023-04-21 18:00:23
*/
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car>
    implements CarService{

}




