package javaproxyaop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyDaoImpl implements InvocationHandler {
    private Object targetObject;

    public ProxyDaoImpl(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Object getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法之前");
        Object o =  method.invoke(targetObject,args);
        return o;
    }
}
