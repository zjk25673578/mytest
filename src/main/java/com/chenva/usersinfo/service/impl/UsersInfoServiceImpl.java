package com.chenva.usersinfo.service.impl;

import com.chenva.usersinfo.entity.UsersInfo;
import com.chenva.usersinfo.mapper.UsersInfoMapper;
import com.chenva.usersinfo.service.UsersInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2018-12-19
 */
@Service
public class UsersInfoServiceImpl extends ServiceImpl<UsersInfoMapper, UsersInfo> implements UsersInfoService {

}
