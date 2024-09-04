package com.loose.coupling;

public class NewDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User Details from New Database : loose coupling";
    }
}

