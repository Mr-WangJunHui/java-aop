package javaproxyaop.proxy;

import java.lang.reflect.Method;

public class AfterDaoProxyImpl extends AfterDaoProxy {
    public void afterHandle(Object proxy, Method method, Object[] args) {
        System.out.println("A+b之后PPPPP！");
    }
}
