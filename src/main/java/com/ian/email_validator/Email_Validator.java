package com.ian.email_validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Ian Tagano
 */


public class Email_Validator 
{
    
    public static boolean isValidEmail(String email)
    {
        String emailRegex = "[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        
        
        return matcher.matches();
                
                
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        
        if (isValidEmail(email)) 
        {
            System.out.println("The email address is valid.");
        } 
        else 
        {
            System.out.println("Invalid email address format.");
        }

        scanner.close();
    }
}
