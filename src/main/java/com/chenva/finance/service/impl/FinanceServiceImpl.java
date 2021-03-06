package com.chenva.finance.service.impl;

import com.chenva.finance.model.Finance;
import com.chenva.finance.dao.FinanceMapper;
import com.chenva.finance.service.FinanceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 财务信息记录表 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@Service
public class FinanceServiceImpl extends ServiceImpl<FinanceMapper, Finance> implements FinanceService {

}
