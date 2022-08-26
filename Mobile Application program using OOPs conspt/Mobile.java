   interface  Sim {
    void wifi();
    void calls();
     void mms();

}
abstract class Services implements Sim {
    public void calls()
      {
        System.out.println("Our network providing unlimited call services");

      }
}
 class Airtel extends Services 
 {
     
      public void mms()
      {
        System.out.println("\n Our network providing mms(multimedia messeging services)");
      }
      public void wifi(){
        System.out.println("\n Our network providing Wifi services");
      }
 }   
    class VodaPhone extends Services
    {
        public void mms()
        {
          System.out.println("\n Our network not  providing mms(multimedia messeging services)");
        }
        public void wifi(){
          System.out.println("\n Our network  providing Wifi services");
        }  
    }
    class Jio extends Services
    {
        public void mms()
        {
          System.out.println("\n Our network not  providing mms(multimedia messeging services)");
        }
        public void wifi(){
          System.out.println("\n Our network  providing  unlimited Wifi services");
        }     
    }
public class Mobile {

    public static void main(String args[])
    {
        Services s= new Airtel();
        s.calls();
        s.wifi();
        s.mms();
        s= new VodaPhone();
        s.calls();
        s.wifi();
        s.mms();
        s= new Jio();
        s.calls();
        s.wifi();
        s.mms();
        
    }
}
