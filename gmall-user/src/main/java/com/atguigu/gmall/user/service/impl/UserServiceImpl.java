package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.beans.UmsMember;
import com.atguigu.gmall.user.mapper.UmsMemberMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> allUser = umsMemberMapper.getAllUser();
        List<UmsMember> user = umsMemberMapper.selectAll();

        return allUser;
    }

    @Override
    public UmsMember getUserById(String uid) {
        UmsMember umsMember = new UmsMember();
        umsMember.setId(uid);
        UmsMember umsMember1 = umsMemberMapper.selectOne(umsMember);


        return umsMember1;
    }
}
