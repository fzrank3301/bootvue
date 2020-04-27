package com.wang.vueuser;

import com.wang.vueuser.DAO.UserDAO;
import com.wang.vueuser.Entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = VueuserApplication.class)
class VueuserApplicationTests {


    @Autowired
    UserDAO userDAO;

    @Test
    public void Usertest()
    {
        UserEntity one = userDAO.findOne("8994e593-2694-469a-8b66-639c32afd9cb");
        System.out.println(one.toString());

    }


}
