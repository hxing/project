package com.project.user.impl;

import com.project.common.vo.BaseReq;
import com.project.servicecode.service.DataBase.USER_LIST.UserListMapper;
import com.project.servicecode.service.DataBase.USER_LIST.model.UserListExample;
import com.project.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserListMapper userListMapper;

    @Override
    public String login(BaseReq req){
        System.out.println("# 开始用户登录身份验证:");
        System.out.println("req ==> {userId:[ " + req.getUserId() + " ];password:[ " + req.getPassword() + " ]}");
        String result = "";
        UserListExample userListExample = new UserListExample();
        userListExample.createCriteria().andUserIdEqualTo(req.getUserId());
        if (userListMapper.countByExample(userListExample) == 1 && Objects.equals(req.getPassword() , userListMapper.selectByPrimaryKey(req.getUserId()).getPassword())){
            result = "Y";
        }else {
            result = "N";
        }
//        System.out.println("验证过程：req.getUserId="+req.getUserId()+"req.getpassword="+req.getPassword()+"数据库按userid查找password="+userListMapper.selectByPrimaryKey(req.getUserId()).getPassword());
        System.out.println("# 用户登录身份验证结束: ");
        System.out.println("resp ==> {result:[ " + result + " ]} ");
        return result;
    }
}
