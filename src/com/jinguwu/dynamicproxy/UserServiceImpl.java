package com.jinguwu.dynamicproxy;

/**
 * Created by jinguwu on 2015/1/20.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void doSomething() {
        System.out.println("doSomething called...");
    }
}
