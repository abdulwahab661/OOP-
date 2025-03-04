package utils;
public class PinValidator{



 public class Rules{


 boolean isValid(String pin){


    if (pin.length() == 4 && pin.matches("\\d+")){


          return true;



    }
   
 else {

        return false;

  }



    }


  }


}