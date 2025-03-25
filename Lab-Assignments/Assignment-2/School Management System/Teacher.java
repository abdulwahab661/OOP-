public class Teacher extends Person{


   private String subject;
   private String teacherID;

  public Teacher(String name,int age, String subject, String teacherID){

  super(name, age);
  this.subject=subject;
  this.teacherID=teacherID;



}

   public String getSubject(){


  return this.subject;


  }


 public void setSubject(String subject){


  this.subject=subject;


  } 

  public String getTeacherID(){


    return this.teacherID;


  }


 public void setTeacherID(String teacherID){

  this.teacherID=teacherID;


  }


  
   @Override
    public boolean equals(Object obj) {

        if (this == obj)
           return true;
 
        if (obj == null || !(obj instanceof Teacher)) 
           return false;

       Teacher other = (Teacher) obj; 

     return this.teacherID.equals(other.teacherID);

    }


    @Override
    public String toString() {


    return String.format("\nTeacher Details:\nName: %s\nAge: %d\nSubject: %s\nTeacher ID: %s\n",getName(),getAge(),subject,teacherID);
       

    }










}
   