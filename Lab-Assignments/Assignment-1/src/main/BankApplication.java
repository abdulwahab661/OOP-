package main;
import banking.BankingSystem;
import utils.PinValidator;

import java.io.Console;
import java.utils.scanner;

public class BankApplication{

 public static void main(String args[]){


 Console console = System.console();


 accountNum=console.readLine("Enter your account number:");
 pinkey=console.readPassword ("Enter your 4-digit PIN:"); 



 PinValidator outer = new PinValidator();
 PinValidator.Rules obj = outer.new Rules();

 BankingSystem bank = new BankingSystem();
 BankingSystem.LoginProcessor valid = new BankingSystem.LoginProcessor();


 if (valid.authenticate(accountNumber,pin))
   {

      System.out.println("Access Granted!");
   

   }


else {

   System.out.println("Error! Please enter in correct format.");


  }

   
} 






}