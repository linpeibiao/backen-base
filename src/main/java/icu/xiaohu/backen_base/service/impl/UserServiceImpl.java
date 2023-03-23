package icu.xiaohu.backen_base.service.impl;

import icu.xiaohu.backen_base.entity.User;
import icu.xiaohu.backen_base.mapper.UserMapper;
import icu.xiaohu.backen_base.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author xiaohu
 * @since 2023-03-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
