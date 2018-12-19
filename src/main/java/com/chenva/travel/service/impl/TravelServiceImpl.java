package com.chenva.travel.service.impl;

import com.chenva.travel.entity.Travel;
import com.chenva.travel.mapper.TravelMapper;
import com.chenva.travel.service.TravelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 家庭旅行计划表 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2018-12-19
 */
@Service
public class TravelServiceImpl extends ServiceImpl<TravelMapper, Travel> implements TravelService {

}
