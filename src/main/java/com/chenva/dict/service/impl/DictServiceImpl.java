package com.chenva.dict.service.impl;

import com.chenva.dict.entity.Dict;
import com.chenva.dict.mapper.DictMapper;
import com.chenva.dict.service.DictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据字典表 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2018-12-19
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements DictService {

}
