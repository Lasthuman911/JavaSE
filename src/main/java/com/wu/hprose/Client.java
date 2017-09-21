package com.wu.hprose;

import hprose.client.HproseHttpClient;

import java.io.IOException;

/**
 * Created by zhiming.wu on 2017/9/21.
 */
public class Client {
    public static void main(String[] args) {
        HproseHttpClient client = new HproseHttpClient();
        client.useService("http://localhost:8080/HproseDemo/hproseservice");
        try{
            String str = (String) client.invoke("Hello",new Object[]{"hprose"});
        }catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
