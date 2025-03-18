public class SystemUnit{

  private String cpuName;
  private int RamSize;
  private int DiskSize;
  private String SystemID;
  private String LCDModel;

  SystemUnit(String cpuName, int RamSize, int DiskSize, String SystemID, String LCDModel){


   this.cpuName=cpuName;
   this.RamSize=RamSize;
   this.DiskSize=DiskSize;
   this.SystemID=SystemID;
   this.LCDModel=LCDModel;
  
}

  public String getcpuName(){


  return this.cpuName;


   }

  public void setcpuName(String cpuName){


  this.cpuName=cpuName;


}


   public int getRamSize(){


  return this.RamSize;


   }

  public void setRamSize(int RamSize){


  this.RamSize=RamSize;


}

 public int getDiskSize(){


  return this.DiskSize;


   }

  public void setDiskSize(int DiskSize){


  this.DiskSize=DiskSize;


}

   public String getSystemID(){


  return this.SystemID;


   }

  public void setSystemID(String SystemID){


  this.SystemID=SystemID;


}






 public String getLCDModel(){


  return this.LCDModel;


   }

  public void setLCDModel(String LCDModel){


  this.LCDModel=LCDModel;


}

  public String toString(){

 
  return String.format("CPU Name: %s\nRam Size: %d\nDisk Size: %d\nSystem ID: %s\nLCD Model: %s\n",cpuName, RamSize, DiskSize, SystemID, LCDModel);



}
















}