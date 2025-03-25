public class School{



  private String name;
  private String address;
  private Classroom[] classes = new Classroom[10];
  private Principal principal;
  private int classCount=0;


  public School(String name, String address, Principal principal){


  this.name=name;
  this.address=address;
  this.principal = principal;


   }

  public String getclassName(){


  return this.name;


  }


 public void setclassName(String name){


  this.name=name;


  }

   public String getAddress(){


  return this.address;


  }


 public void setAddress(String address){


  this.address=address;


  } 
 

   public void addClassroom(Classroom classroom) {

        if (classCount < 10) {

            classes[classCount++] = classroom;
            System.out.println("Classroom " + classroom.getclassName() + " added to school");
        }

         else {
           
            System.out.println("You cannot add more classrooms.");

        }
    }

      @Override
      public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("School Name: " + getclassName() + "\n");
        sb.append("Address" + address + "\n ");
        sb.append(principal + "\n");
        sb.append("Classrooms:\n");

        
        for (int i = 0; i < classCount; i++) {

            sb.append(classes[i] + "\n");

        }

        return sb.toString();
    }


















}
  