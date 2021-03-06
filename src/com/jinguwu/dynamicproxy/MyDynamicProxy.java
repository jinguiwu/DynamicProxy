package com.jinguwu.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by jinguwu on 2015/1/20.
 */
public class MyDynamicProxy implements InvocationHandler {

    private Object target;

    public MyDynamicProxy(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before method invoke...");
        Object result = method.invoke(target, args);
        System.out.println("After method invoke...");
        return result;
    }
}
