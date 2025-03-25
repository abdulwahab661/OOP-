public class Student extends Person{


   private int rollNum;
   
  Student(String name, int age, int rollNum){

   super(name,age);
   this.rollNum=rollNum;
  

                                                                         
}


 public int getRollNumber(){


  return this.rollNum;


  }

 public void setRollNumber(int rollNum){


  this.rollNum=rollNum;


  }




   @Override
    public boolean equals(Object obj) {

        if (this == obj)
           return true;
 
        if (obj == null || !(obj instanceof Student)) 
           return false;

       Student other = (Student) obj; 

     return this.rollNum == (other.rollNum);

    }


   @Override
    public String toString() {


    return String.format("\nStudent Details:\nName: %s\nAge: %d\nRoll Number: %d\n",getName(),getAge(),rollNum);
       

    }






























}