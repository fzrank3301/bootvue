package com.wang.vueuser.Service;

import com.wang.vueuser.Entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;


public interface UserService {

    List<UserEntity> findAll();

    void save(UserEntity user);

    void delete(String id);

    UserEntity findOne(String id);

    void update(UserEntity user);

    List<UserEntity> findNameOrPhonecode(String name,String phonecode);
}
