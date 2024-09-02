package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        // UserDataProvider userDataProvider = new UserDatabaseProvider();
        UserDataProvider userDataProvider = new WebServiceDatabaseProvider();
        UserManager userManager = new UserManager(userDataProvider);
        System.out.println(userManager.getUserInfo());
    }
}
// test code push by ak-699