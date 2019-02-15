package javaproxyaop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public abstract  class DaoProxy  implements InvocationHandler {
    private Object targetObject;

    public Object getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(Object targetObject){
        this.targetObject = targetObject;
    }

}
