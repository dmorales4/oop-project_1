package io;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jimmy
 * Will be used to send e-mails out to users
 * 
 */


import java.util.*;

public class EmailBot {
    String email;
    String email_pass;
    
    public EmailBot(){ // will use the bina-bot I already have created
        this.email = "";
        this.email_pass = "";
    }
    
    public void sendEmail(String reciver, String msg){
        //recepient email
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter recipient's e-mail: ");
        String recipient_email = scanner.nextLine();
        String Letters ="AaBbCc";
        String Numbers = "0, 1, 2, 3, 4";
        String Symbols = "&, %, $";
        String symbo_code = Letters+Numbers+Symbols;
        Random rndm_method = new Random();
        char[] account_code = new char[5];
        for (int i = 0; i<6; i++){
          account_code[i] = symbo_code.charAt(rndm_method.nextInt(symbo_code.length()));
        }
        
        email_pass = Character.toString(account_code);
        email = recipient_email;
        // logic here
        
        System.out.format("Sending email to ", email);
        System.out.format("Your unlock code is", email_pass);
    }
    
}
