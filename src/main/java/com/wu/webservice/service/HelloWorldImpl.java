package com.wu.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by zhiming.wu on 2017/9/20.
 */
@WebService
public class HelloWorldImpl implements HelloWorldWS {
    @WebMethod
    @Override
    public String sayHello(String name) {
        String str = "hello,welcome "+name;
        System.out.println(str);
        return str;
    }
}
