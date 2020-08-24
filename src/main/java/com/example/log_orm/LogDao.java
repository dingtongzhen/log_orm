package com.example.log_orm;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author yanlianglong
 * @Title: LogMapper.java
 * @Package com.example.log_orm
 * @Description:
 * @date 2020/3/10 10:58
 */
@Mapper
public interface LogDao {
    void insert(Log log);
}
