package com.ifox.springbootmybatisplus.service;

import com.baomidou.mybatisplus.service.IService;
import com.ifox.springbootmybatisplus.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:04 2018/4/11
 * @Modified By:    User 表数据服务层接口
 */
@Service
public interface IUserService extends IService<User> {

    boolean deleteAll();

    List<User> selectListBySQL();
}
