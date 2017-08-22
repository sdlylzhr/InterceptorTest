package com.lanou.intercepter;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lizhongren1 on 2017/8/21.
 */
public class Interceptor01 extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 低侵入式设计
        // 在请求处理之前调用这个方法

        System.out.println("---------------------");
        System.out.println("interceptor01----preHandle");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        // 请求处理之后调用这个方法
        System.out.println("interceptor01----postHandle");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        // 请求处理完成调用这个方法

        System.out.println("interceptor01----afterCompletion");
    }


    // 适配器模式
    // 适配器类主动实现了接口的所有方法
    // 实现的方法都是空实现,不含任何业务代码
    //
    // 可以让子类自主的有选择的去重写个别方法

    // 拦截器:
    // 方法调用的顺序:
    // 按照配置文件的顺序依次执行preHandle方法
    // 按照逆序, 执行postHandle和afterCompletion方法

    // 如果拦截器中有一个preHandle方法返回false
    // 配置顺序后面的所有的拦截器都不再执行preHandle
    // 所有的postHandle都不会执行
    // 前面的所有返回true的拦截器, 依然会执行afterCompletion方法






}
