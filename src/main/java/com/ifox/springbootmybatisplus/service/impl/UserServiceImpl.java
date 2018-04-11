package com.ifox.springbootmybatisplus.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ifox.springbootmybatisplus.entity.User;
import com.ifox.springbootmybatisplus.mapper.UserMapper;
import com.ifox.springbootmybatisplus.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:05 2018/4/11
 * @Modified By:    User 表数据服务层接口实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService{


    @Override
    public boolean deleteAll() {
        return retBool(baseMapper.deleteAll());
    }

    @Override
    public List<User> selectListBySQL() {
        return baseMapper.selectListBySQL();
    }
}
