public class Classroom{



   private String className;
   private String classCode;
   private Teacher teachers;
   private Student[] students=new Student[5];
   private int studentCount=0;

   public Classroom(String className, String classCode, Teacher teachers){


   this.className=className;
   this.classCode=classCode;
   this.teachers=teachers;
   
     }

  public String getclassName(){


  return this.className;


  }


 public void setclassName(String className){


  this.className=className;


  } 

  public String getclassCode(){


  return this.classCode;


  }


 public void setclassCode(String classCode){


  this.classCode=classCode;


  } 

   public void addStudent(Student student)
 {
        if (studentCount < 5) {

            students[studentCount++] = student;

            System.out.println("Student is added to Class");
          }

    else {

            System.out.println("The Class is full! You cannot add more students.");
        }
 }

   

     @Override
      public String toString() 
   {

        
        StringBuilder sb = new StringBuilder();

       sb.append("Class Name: " + className + "\n");
       sb.append("Class Code: " + classCode + "\n");
       sb.append("Teacher: " + teachers + "\n");
       sb.append("Students:\n");

       
        for (int i = 0; i < studentCount; i++) 
        {

            sb.append(students[i] + "\n");

        }

        return sb.toString();
    } 






 
}  