public class Person{


  private String name;
  private String role;
  private Address address;


   Person(String name, String role, Address address){

   this.name=name;
   this.role=role;
   this.address=address;
    
   }

   Person(Person other){

    this.name=other.name;
    this.role=other.role;
    this.address=other.address;


   }
 
   public void showPersonDetails(){

    System.out.printf("");


    }


//  public boolean equals (Object obj){




//    }

  
   public String getName(){


   return this.name;



   }
   
   public void setName(){


     this.name=name;



   }
   

   public String getRole(){


   return this.role;



   }
   

   public void setRole(){


     this.role=role;



   }
   

































}