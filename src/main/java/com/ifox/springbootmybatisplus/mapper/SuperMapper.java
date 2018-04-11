package com.ifox.springbootmybatisplus.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:02 2018/4/11
 * @Modified By:演示 mapper 父类，注意这个类不要让 mp 扫描到！！// 这里可以放一些公共的方法
 */
public interface  SuperMapper<T> extends BaseMapper<T> {

}
