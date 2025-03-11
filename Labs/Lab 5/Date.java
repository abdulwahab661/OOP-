public class Date{

     private int day;
     private int month;
     private int year;


    Date(int day, int month, int year){


    this.day=day;
    this.month=month;
    this.year=year;


     }

    Date(Date other){

    this.day=other.day;
    this.month=other.day;
    this.year=other.year;
 

  }

    public void showDate(){

    System.out.printf("%d-%d-%d");



  } 

   
  // public boolean equals(Object obj){





//    }

      public int getDay(){

        return this.day;

     }


     public void setDate(int day){

      this.day=day;


    }
 

 
     public int getMonth(){
 
      return this.month;
  
     }


   public void setMonth(int month){

     this.month=month;


   }


    public int getYear(){

     return this.year;

   }
 
    public void setYear(int year){

      this.year=year;


}
 


 






  






























}