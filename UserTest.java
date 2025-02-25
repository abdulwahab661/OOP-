 import java.util.Scanner;


 class UserTest{



 public static void main(String args[]){
  
   Scanner input = new Scanner (System.in);
   Scanner input1 = new Scanner (System.in);
   UserInfo obj= new UserInfo();

  String Username1;
  String Password1;

   System.out.print("Enter Username: ");
   Username1 = input.next();
  

   System.out.print("Enter Password: ");
   Password1 = input1.next();
   
 


 if (Username1.equals(obj.getUsername())){
   
   if(Password1.equals(obj.getPassword())){

   System.out.println("Username and Password is Correct.");

      }

   else{

       System.out.println("Username and Password is Incorrect.");


   }


}



 else{

         System.out.println("Username and Password is Incorrect.");


 }


}












}