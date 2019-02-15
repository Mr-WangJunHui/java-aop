package com.tuling.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoginAop {

    @Pointcut("execution(* com.tuling.service.LoginService.*(..))")
    public void pointcut(){

    }

    @After("com.tuling.aop.LoginAop.pointcut")
    public void after(){
        System.out.println("登陆之后");
    }
}
