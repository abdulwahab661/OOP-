public class Book{

    private String title;
    private String issn;
    private Date publicationDate;
    private Person author;

 
    Book(String title, String issn, Date publicationDate, Person author){


     this.title=title;
     this.issn=issn;
     this.publicationDate=publicationDate;
     this.author=author;

     }

     Book(Book other){

     this.title=other.title;
     this.issn=other.issn;
     this.publicationDate=other.publicationDate;
     this.author=other.author;



     }     
 
     public void showBookDetails(){

     System.out.printf("");


      }
  
     
 //    public boolean equals(Object obj){

      
     

    // }
      
     public String getTitle(){


      return this.title;

       }

     public void setTitle(String title){


      this.title=title;

    }


    public String getIssn(){


      return this.issn;

   } 


   public void setIssn(String issn){


      this.issn=issn;

   }


















}

