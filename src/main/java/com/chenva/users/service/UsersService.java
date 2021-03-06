package com.chenva.users.service;

import com.chenva.users.model.Users;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 系统用户表 服务类
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
public interface UsersService extends IService<Users> {

    Integer newCount();
}
