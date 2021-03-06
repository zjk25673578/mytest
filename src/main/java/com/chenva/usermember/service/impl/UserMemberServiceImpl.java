package com.chenva.usermember.service.impl;

import com.chenva.usermember.model.UserMember;
import com.chenva.usermember.dao.UserMemberMapper;
import com.chenva.usermember.service.UserMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户成员表 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@Service
public class UserMemberServiceImpl extends ServiceImpl<UserMemberMapper, UserMember> implements UserMemberService {

}
