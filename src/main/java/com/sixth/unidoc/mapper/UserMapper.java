package com.sixth.unidoc.mapper;

import com.sixth.unidoc.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;


/**
 * User 映射类
 */
@Mapper
public interface UserMapper {

    /**
     * 根据用户信息执行插入
     *
     * @param user 用户模型
     * @return 模板名称
     */
    @Select("INSERT INTO USER(username, password,email,phone) VALUES(#{username},#{password},#{email},#{phone})")
    String save(User user);

    @Select("SELECT username,password FROM USER WHERE username = #{username}")
    boolean isExist(User user);

    @Select("SELECT username,password FROM USER WHERE username = #{username}")
    Map<String, String> findByUsername(String username);

}
