package com.keysoft.onepage.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import javax.servlet.http.HttpServletRequest;
//页面类模板
public class IndexTemplate {
    //用于获取请求地址
    @Autowired
    private HttpServletRequest request;
    //用于获取当前环境参数
    @Autowired
    private Environment env;

    //获取当前页面的地址
    protected String getPageURL(){
        String url = "";
        url = request.getScheme() +"://" + request.getServerName()
                + ":" +request.getServerPort()+env.getProperty("server.servlet.context-path")
                + request.getServletPath();
        if (request.getQueryString() != null){
            url += "?" + request.getQueryString();
        }
        return url;
    }
}
