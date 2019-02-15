package com.tuling.test;

import com.tuling.service.Login;
import com.tuling.service.LoginService;

public class TestAop {
    public static void main(String[] args) {
        Login login = new LoginService();
        login.sayHi();
    }
}
