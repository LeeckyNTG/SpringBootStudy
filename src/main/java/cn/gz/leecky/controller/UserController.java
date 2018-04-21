package cn.gz.leecky.controller;

import cn.gz.leecky.pojo.User;
import cn.gz.leecky.utils.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @RequestMapping("getUser")
    public JsonResult getUser() {


        User user = new User();

        user.setAge(22);
        user.setUsername("admin666123");
        user.setPassword("admin");
//        user.setTel("15754326082");
        user.setBirthDay(new Date());

        JsonResult jsonResult = new JsonResult(user);
        jsonResult.setMessage("返回成功！");

        return jsonResult;
    }

    @RequestMapping("getUser1")
    public JsonResult getUser1() {


        User user = new User();

        user.setAge(22);
        user.setUsername("admin666");
        user.setPassword("admin");
//        user.setTel("15754326082");
        user.setBirthDay(new Date());

        JsonResult jsonResult = new JsonResult(user);
        jsonResult.setMessage("返回成功！");

        return jsonResult;
    }
}
