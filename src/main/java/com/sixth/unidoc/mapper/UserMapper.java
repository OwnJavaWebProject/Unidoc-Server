package com.sixth.unidoc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


/**
 * User 映射类
 */
@Mapper
public interface UserMapper {

    @Select("INSERT INTO USER(Username, Password) VALUES(#{username},#{password})")
    String insert(@Param("username") String name, @Param("password") String password);

}
