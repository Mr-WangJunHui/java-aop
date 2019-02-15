package javaproxyaop.test;

import javaproxyaop.proxy.AfterDaoProxy;
import javaproxyaop.proxy.AfterDaoProxyImpl;
import javaproxyaop.proxy.ProxyDaoImpl;
import javaproxyaop.service.Dao;
import javaproxyaop.service.DaoImpl;
import javaproxyaop.proxy.DaoProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestJavaAop {
    public static void main(String[] args) {
        //目标对象
        Dao dao = new DaoImpl();

        //代理对象

        AfterDaoProxy afterDaoProxy = new AfterDaoProxyImpl();
        afterDaoProxy.setTargetObject(dao);
       /* ProxyDaoImpl proxyDao = new ProxyDaoImpl(dao);*/


        Dao dao1 = (Dao) Proxy.newProxyInstance(Dao.class.getClassLoader(),new Class[]{Dao.class},afterDaoProxy);
       /* Dao dao1 = (Dao)Proxy.newProxyInstance(Dao.class.getClassLoader(),new Class[]{Dao.class},proxyDao);*/
        Integer a =  dao1.parse(1,2);
        System.out.println(a);




    }
}
