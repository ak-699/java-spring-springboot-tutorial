package com.loose.coupling;

public class UserDatabase {
    public String getUserDetails() {
        // Directly access database and return some information
        return "User Details from database";
    }
}

// To promote loose coupling we will make use of interface