
public class PolymorphismBentuk {
 
   public static void main(String[] args) { 
   Bola object = new Bola();
   Kubus object2 = new Kubus();
   object.tampilBentuk(); 
   object2.tampilBentuk(); 
      }
}

class Bola extends PolymorphismBentuk {
   
    public void tampilBentuk(){
        
    System.out.println("Bentuk Bola : Bulat ");
       
   }
}

class Kubus extends PolymorphismBentuk
{
  public void tampilBentuk(){
    

    System.out.println("Bentuk Kubus : Kotak");
    
       
   }
   
}
