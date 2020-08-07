package com.car.lease.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.stream.StreamSupport;

/**
 * @description:
 * @author: yanghaojie 31648
 * @date: 2020/8/7 9:35
 * web工具类
 */
public class WebUtils {
    public static ServletRequestAttributes getServletRequsetAttributes(){
        return (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    }

    /*** 
     * 得到当前线程的请求对象
     *
     * @return javax.servlet.http.HttpServletRequest
     * @author yanghaojie 31648
     * @date 2020/8/7 9:41
    **/
    public static HttpServletRequest getHttpServletRequest(){
        return getServletRequsetAttributes().getRequest();
    }

    /*** 
     * 得到当前线程响应的对象
     *
     * @return javax.servlet.http.HttpServletResponse
     * @author yanghaojie 31648
     * @date 2020/8/7 9:42
    **/
    public static HttpServletResponse getHttpServletResponse(){
        return getServletRequsetAttributes().getResponse();
    }

    /***
     * 得到session对象
     *
     * @return javax.servlet.http.HttpSession
     * @author yanghaojie 31648
     * @date 2020/8/7 9:44
    **/
    public static HttpSession getHttpSession(){
        return getHttpServletRequest().getSession();
    }

    /***
     * 得到ServletContext对象
     *
     * @return javax.servlet.ServletContext
     * @author yanghaojie 31648
     * @date 2020/8/7 9:45
    **/
    public static ServletContext getServletContext(){
        return getHttpServletRequest().getServletContext();
    }
}
