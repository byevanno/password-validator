package com.example.vanno.password_validator;


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
        return(rule1(p)+ rule2(p));
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
}
