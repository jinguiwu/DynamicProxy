package com.jinguwu.dynamicproxy;

/**
 * Created by jinguwu on 2015/1/20.
 */
public class MyDynamicProxyTest {
    public static void main(String[] args){

        UserService userService = new UserServiceImpl();
        MyDynamicProxy myDynamicProxy = new MyDynamicProxy(userService);
        UserService proxy = (UserService) myDynamicProxy.getProxy();
        proxy.doSomething();

    }
}
