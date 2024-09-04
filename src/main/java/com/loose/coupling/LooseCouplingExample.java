package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDatabaseProvider = new UserDatabaseProvider();
        UserManager userManager = new UserManager(userDatabaseProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider userWebServiceDatabaseProvider = new WebServiceDatabaseProvider();
        userManager = new UserManager(userWebServiceDatabaseProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider userNewDatabaseProvider = new NewDatabaseProvider();
        userManager = new UserManager(userNewDatabaseProvider);
        System.out.println(userManager.getUserInfo());
    }
}
// test code push by ak-699