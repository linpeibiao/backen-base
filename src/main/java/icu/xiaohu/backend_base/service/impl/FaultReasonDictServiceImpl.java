package icu.xiaohu.backend_base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.xiaohu.backend_base.model.entity.FaultReasonDict;
import icu.xiaohu.backend_base.service.FaultReasonDictService;
import icu.xiaohu.backend_base.mapper.FaultReasonDictMapper;
import org.springframework.stereotype.Service;

/**
* @author xiaohu
* @description 针对表【tb_fault_reason_dict(汽车故障表)】的数据库操作Service实现
* @createDate 2023-04-21 18:00:23
*/
@Service
public class FaultReasonDictServiceImpl extends ServiceImpl<FaultReasonDictMapper, FaultReasonDict>
    implements FaultReasonDictService{

}



