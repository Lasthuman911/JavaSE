package com.wu.hprose;

import hprose.common.HproseMethods;
import hprose.server.HproseServlet;

/**
 * Created by zhiming.wu on 2017/9/21.
 */
public class HproseServletDemo extends HproseServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void setGlobalMethods(HproseMethods methods) {
        super.setGlobalMethods(methods);
        //new出service对象，发布类里面所有的公共方法
        Services ss = new Services();
        methods.addMethod("Hello",ss);
    }
}
