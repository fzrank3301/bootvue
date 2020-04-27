package com.wang.vueuser.Controller;


import com.wang.vueuser.Entity.ResponseEntity;
import com.wang.vueuser.Entity.UserEntity;
import com.wang.vueuser.Service.UserService;
import org.omg.CORBA.RepositoryIdHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("findall")
    @CrossOrigin
    public List<UserEntity> findAll() {
        List<UserEntity> all = userService.findAll();
        return all;
    }


    @PostMapping("save")
    @CrossOrigin
    public ResponseEntity save(@RequestBody UserEntity userEntity) {
        try {
            if (userEntity.getId().isEmpty()) {
                userService.save(userEntity);
                return new ResponseEntity().setStatecode(ResponseEntity.SUCCESS)
                        .setMsg("用户保存成功！");
            } else {
                userService.update(userEntity);
                return new ResponseEntity().setStatecode(ResponseEntity.SUCCESS)
                        .setMsg("用户更新成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity().setStatecode(ResponseEntity.ERROR)
                    .setMsg("用户保存或更新失败！");
        }
    }


    @GetMapping("delete")
    @CrossOrigin
    public ResponseEntity delete(@RequestParam("id") String id) {
        try {
            userService.delete(id);
            return new ResponseEntity().setStatecode(ResponseEntity.SUCCESS)
                    .setMsg("用户删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity().setStatecode(ResponseEntity.ERROR)
                    .setMsg("用户删除失败");
        }
    }


    @GetMapping("findoneuser")
    @CrossOrigin
    public UserEntity findOne(String id) {
        try {
            System.out.println(id);
            UserEntity one = userService.findOne(id);
            return one;
        } catch (Exception e) {
            e.printStackTrace();
            return new UserEntity().setName("null");
        }
    }

    @GetMapping("findNameOrPhonecode")
    @CrossOrigin
    public List<UserEntity> findNameOrPhonecode(String name,String phonecode)
    {
        List<UserEntity> nameOrPhonecode = userService.findNameOrPhonecode(name, phonecode);
        return nameOrPhonecode;
    }

}
