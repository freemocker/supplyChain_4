package cn.com.edzleft.controller.captial;

import cn.com.edzleft.service.captial.Rainservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ASUS on 2017/10/30.
 */
@Controller
@RequestMapping("/user")
public class Raincontroller {

    @Autowired
    private Rainservice rainservice;

    /**
     * 添加用户
     * @param user
     * @param request
     * @return
     */
    @RequestMapping(value="/addUser")
    public String addUser(){
        System.out.println("aaa++++++++++++++++++++++++++++++");
        return "/capital/main";
    }

}
