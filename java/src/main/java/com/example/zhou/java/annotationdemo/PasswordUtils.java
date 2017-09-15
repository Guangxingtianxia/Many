package com.example.zhou.java.annotationdemo;

import java.util.List;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/17  11:40
 * @Desc :
 */

public class PasswordUtils
{
    @UseCase(id = 47,description = "password must contain one numeric")
    public boolean validatePassword(String password)
    {
        return password.matches("\\w*\\d\\w*");

    }


    @UseCase(id = 48)
    public String encryptPassword (String password)
    {
        return new StringBuffer(password).reverse().toString();
    }


    @UseCase(id = 49, description = " New password can't equal previously used one  ")
    public boolean checkForNewPassword(List<String> prePasswords , String password)
    {
      return !prePasswords.contains(password);
    }

}
