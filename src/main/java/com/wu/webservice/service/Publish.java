package com.wu.webservice.service;

import javax.xml.ws.Endpoint;

/**
 * 发布webService
 * Created by zhiming.wu on 2017/9/20.
 */
public class Publish {
    public static void main(String[] args) {
        Object implementor = new HelloWorldImpl();
            String address = "http://localhost:8989/HelloWorld";
        Endpoint.publish(address,implementor);
        System.out.println("发布成功");
    }
}
