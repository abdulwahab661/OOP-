public class Principal extends Person{


   private int experience;


  public Principal(String name, int age, int experience){

   super(name,age);
   this.experience=experience;
  

  }

 public int getExperience(){


  return this.experience;


  }

 public void setExperience(int experience){


  this.experience=experience;


  }

    @Override
    public String toString() {


    return String.format("Principal Details:\nName: %s\nAge: %d\nExperience: %d\n",getName(),getAge(),experience);
       

    }






















}
   