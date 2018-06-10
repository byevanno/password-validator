package com.example.vanno.password_validator;


import java.lang.reflect.Array;

public class Validator {

    public Validator()
    {
    }

    private String password;

    public void enter_password(String pass)
    {
        password = pass;
    }

    public String get_password()
    {
        return password;
    }

    public int validate(String p)
    {
        return(rule1(p)+ rule2(p)+ rule3(p)+ rule4(p)+ rule5(p));
    }
    //checks if password is longer than 7 characters
    private int rule1(String p)
    {
        if(p.length() >7)
        {
            //returns 10 if true to keep track if this rule
            //or the other rule was broken
            return 10;
        }
        else return 0;
    }
    //checks that password is not "password"
    private int rule2(String p)
    {
        if(!p.matches("password"))
        {
            //returns 1 if true to keep track if this rule
            //or the other rule was broken
            return 1;
        }
        else return 0;
    }
    //checks that password contains a digit
    private int rule3(String p)
    {
        if(p.matches(".*[0-9].*"))
        {
            return 1000;
        }
        return 0;
    }
    //checks that password contains a special char
    private int rule4(String p)
    {
        if(p.matches(".*[@#$%^&+=].*"))
        {
            return 10000;
        }
        return 0;
    }
    //checks that password contains an uppercase letter
    private int rule5(String p)
    {
        if(p.matches(".*[A-Z].*"))
        {
            return 100000;
        }
        return 0;
    }
}
