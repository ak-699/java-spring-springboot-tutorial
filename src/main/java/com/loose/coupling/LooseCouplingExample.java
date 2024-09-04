package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCoupling.xml");

        UserDataProvider userDatabaseProvider = (UserDataProvider) context.getBean("myDatabaseProvider");
        UserManager userManager = new UserManager(userDatabaseProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider userWebServiceDatabaseProvider = (UserDataProvider) context.getBean("myWebServiceDatabaseProvider");
        userManager = new UserManager(userWebServiceDatabaseProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider userNewDatabaseProvider = (UserDataProvider) context.getBean("myNewDatabaseProvider");
        userManager = new UserManager(userNewDatabaseProvider);
        System.out.println(userManager.getUserInfo());
    }
}
// test code push by ak-699