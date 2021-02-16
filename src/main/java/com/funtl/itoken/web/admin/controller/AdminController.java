package com.funtl.itoken.web.admin.controller;


import com.funtl.itoken.web.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService ;

    @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
    public  String login(){

        String json = adminService.login("492598913@qq.com", "123456");
        System.out.print(json);
        return "index" ;
    }
}
