package com.ifox.springbootmybatisplus.mapper;

import com.baomidou.mybatisplus.annotations.SqlParser;
import com.ifox.springbootmybatisplus.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:03 2018/4/11
 * @Modified By:    User 表数据库控制层接口
 */
public interface UserMapper extends SuperMapper<User> {

    int deleteAll();

    /**
     * 注解 @SqlParser(filter = true) 过滤多租户解析
     */
    @SqlParser(filter = true)
    @Select("select test_id as id, name, age, test_type from user")
    List<User> selectListBySQL();
}
