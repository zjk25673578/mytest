package com.chenva.users.service.impl;

import com.chenva.users.model.Users;
import com.chenva.users.dao.UsersMapper;
import com.chenva.users.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    @Override
    public Integer newCount() {
        return baseMapper.newCount();
    }
}
