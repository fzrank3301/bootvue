package com.wang.vueuser.Service;

import com.wang.vueuser.DAO.UserDAO;
import com.wang.vueuser.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<UserEntity> findAll() {
        List<UserEntity> all = userDAO.findAll();
        return  all;
    }

    @Override
    public void save(UserEntity user) {
        user.setId(UUID.randomUUID().toString());
        userDAO.save(user);
    }

    @Override
    public void delete(String id) {
        userDAO.delete(id);
    }

    @Override
    public UserEntity findOne(String id) {
        UserEntity one = userDAO.findOne(id);
        return one;
    }

    @Override
    public void update(UserEntity user) {
        userDAO.update(user);
    }

    @Override
    public List<UserEntity> findNameOrPhonecode(String name, String phonecode) {
        List<UserEntity> nameOrPhonecode = userDAO.findNameOrPhonecode(name, phonecode);
        return nameOrPhonecode;
    }


}
