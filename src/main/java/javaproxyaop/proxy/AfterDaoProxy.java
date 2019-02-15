package javaproxyaop.proxy;

import java.lang.reflect.Method;

public abstract  class AfterDaoProxy extends DaoProxy{
    public abstract void afterHandle(Object proxy,Method method,Object[] args);

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable{
        Object o = method.invoke(super.getTargetObject(),args);
        afterHandle(proxy,method,args);
        return o;
    }

}
