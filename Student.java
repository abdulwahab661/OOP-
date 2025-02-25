class Student{


  private String Name;
  private String Regno;
  private String Address;
  private String City;
  private double GPA;
  private static int counter=1;


  Student(String Name, String Address, String City, double GPA) {

  this.Name= Name;
  this.Address=Address;
  this.City= City;
  this.GPA=GPA;
  Regno=String.format("FA24-BCS-%03d",counter++);



}



 //Name
  public void setName(String Name){
    this.Name=Name;

  } 

  String getName(){
  return Name;
   }
  

 //Address
 public void setAddress(String Address){
    this.Address=Address;

  } 

  String getAddress(){
  return Address;
   }


 //City
 public void setCity(String City){
   this.City=City;

  } 

  String getCity(){
  return City;
   }
  

 //GPA
 public void setGPA(double GPA){
    if (GPA>0)
    this.GPA=GPA;

  } 

  double getGPA(){
  return GPA;
   }


  //Function to display information
  public void displayInfo(){

   System.out.printf(" My Name is: %s \n" , Name);
   System.out.printf(" My Registration No. is: %s \n " , Regno);
   System.out.printf(" My Address is: %s \n " , Address);
   System.out.printf(" I'm from: %s \n " , City);
   System.out.printf(" My GPA is %.2f \n" , GPA);




}

  


  
   
  









}