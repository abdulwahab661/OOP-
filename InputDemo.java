import java.util.Scanner;

public class InputDemo{
 
   public static void main(String [] args) {


   Scanner input = new Scanner (System.in);
   Scanner strinput = new Scanner (System.in);
    
   System.out.printf("Abdul Wahab FA24-BCS-004\n");
   
   //Data types
   int i;
   float f;
   long l;
   short s; 
   byte b;
   double d;
   char c;
   String str;
   String str1;
   boolean bol;

 
  //Boolean
   System.out.print("Enter a boolean value: ");
   bol = input.nextBoolean();
   System.out.printf("Boolean Value: %b\n",bol);

 
   //Int 
   System.out.print("Enter an integer: ");
   i = input.nextInt();
   System.out.printf("Integer Number: %d\n",i);

   //Float
   System.out.print("Enter a float number: ");
   f = input.nextFloat();
   System.out.printf("Float Number: %f\n",f);

  //Short
   System.out.print("Enter a short integer: ");
   s = input.nextShort();
   System.out.printf("Short Number: %d\n",s);

  //Long
   System.out.print("Enter a long integer: ");
   l = input.nextLong();
   System.out.printf("Long Number: %d\n",l);

  //Byte
   System.out.print("Enter a byte: ");
   b = input.nextByte();
   System.out.printf("Byte Number: %d\n",b);

  //Double
   System.out.print("Enter a double number: ");
   d = input.nextDouble();
   System.out.printf("Double Number: %f\n",d);

  //String
   System.out.print("Enter a word: ");
   str = input.next();
   System.out.printf("String without spaces: %s\n",str);

   //String
   System.out.print("Enter a string: ");
   str1 = strinput.nextLine();
   System.out.printf("String with spaces: %s\n",str1);

   //Character
    System.out.print("Enter a character: ");
    c = input.next().charAt(0);
    System.out.printf("Character is: %c\n",c);








  }
}