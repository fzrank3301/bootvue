package com.wang.vueuser.DAO;

import com.wang.vueuser.Entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDAO {

    List<UserEntity> findAll();

    void save(UserEntity user);

    void delete(String id);

    UserEntity findOne(String id);

    void update(UserEntity user);

    List<UserEntity> findNameOrPhonecode(@Param("name") String name,@Param("code") String phonecode);

}
