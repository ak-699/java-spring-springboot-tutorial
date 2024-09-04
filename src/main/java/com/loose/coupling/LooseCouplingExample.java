package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCoupling.xml");

        UserDataProvider userDatabaseProvider = (UserDataProvider) context.getBean("myDatabaseProvider");
        UserManager userManager1 = new UserManager(userDatabaseProvider);
        System.out.println(userManager1.getUserInfo());

        UserDataProvider userWebServiceDatabaseProvider = (UserDataProvider) context.getBean("myWebServiceDatabaseProvider");
        UserManager userManager2 = new UserManager(userWebServiceDatabaseProvider);
        System.out.println(userManager2.getUserInfo());

        UserDataProvider userNewDatabaseProvider = (UserDataProvider) context.getBean("myNewDatabaseProvider");
        UserManager userManager3 = new UserManager(userNewDatabaseProvider);
        System.out.println(userManager3.getUserInfo());
    }
}
// test code push by ak-699