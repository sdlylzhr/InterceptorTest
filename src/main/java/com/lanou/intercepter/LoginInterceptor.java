package com.lanou.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by lizhongren1 on 2017/8/21.
 */
public class LoginInterceptor implements HandlerInterceptor{
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 可以判断请求的URI来确定是否拦截

        String uri = request.getRequestURI();

        if (uri.indexOf("login") > 0){

            return true;
        }

        // 靠session判断用户是否登录

        HttpSession session = request.getSession();

        String username = (String) session.getAttribute("username");

        if (username != null){

            return true;
        }

        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);

        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
