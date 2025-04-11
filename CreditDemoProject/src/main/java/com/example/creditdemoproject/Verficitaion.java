package com.example.creditdemoproject;

import java.sql.SQLException;

public class Verficitaion {
    public boolean verifyuser(Integer number, String expiryDate, Integer cvv,String name) throws SQLException {
        Connectivity ref = new DataBaseConnectivity();
        boolean result = ref.isValid(number,expiryDate,cvv,name);
        if(result==true)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
