package com.chenva.usermenu.service.impl;

import com.chenva.usermenu.model.UserMenu;
import com.chenva.usermenu.dao.UserMenuMapper;
import com.chenva.usermenu.service.UserMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户菜单表 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@Service
public class UserMenuServiceImpl extends ServiceImpl<UserMenuMapper, UserMenu> implements UserMenuService {

}
