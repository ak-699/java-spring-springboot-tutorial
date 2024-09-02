package com.loose.coupling;

public class WebServiceDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User Details from Web Service: loose coupling";
    }
}
