package com.lanou.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by lizhongren1 on 2017/8/21.
 */

@Controller
public class MainController {

    @RequestMapping(value = "/frontpage")
    public String frontpage(){

        return "index";
    }

    @RequestMapping(value = "/loginpage")
    public String loginpage(){
        return "login";
    }

    @RequestMapping(value = "/userpage")
    public String userpage(){
        return "userinfo";
    }

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password){

        // 登录的业务逻辑
        // 假如登录成功

        HttpSession session = request.getSession();

        session.setAttribute("username", username);

        return "redirect:userpage";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request){

        HttpSession session = request.getSession();

        session.invalidate();

        return "redirect:loginpage";
    }
}
