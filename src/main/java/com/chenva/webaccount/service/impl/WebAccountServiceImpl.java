package com.chenva.webaccount.service.impl;

import com.chenva.webaccount.entity.WebAccount;
import com.chenva.webaccount.mapper.WebAccountMapper;
import com.chenva.webaccount.service.WebAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 网站账号信息表 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2018-12-19
 */
@Service
public class WebAccountServiceImpl extends ServiceImpl<WebAccountMapper, WebAccount> implements WebAccountService {

}
