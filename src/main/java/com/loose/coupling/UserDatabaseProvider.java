package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        // Directly access database and return some information
        return "User Details from database: loose coupling";
    }
}

// To promote loose coupling we will make use of interface