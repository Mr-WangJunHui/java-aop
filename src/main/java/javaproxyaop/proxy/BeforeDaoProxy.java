package javaproxyaop.proxy;

import java.lang.reflect.Method;

/**
 * 方法执行之前
 */
public abstract class BeforeDaoProxy extends DaoProxy{

    public abstract void beforeHandle(Object proxy,Method method,Object[] args);

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable{
        beforeHandle(getTargetObject(),method,args);
        method.invoke(proxy,args);
        return null;
    }
}
