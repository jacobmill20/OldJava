class TempClass { 

   int i; 

   public TempClass(int j) {

      int i = j;  

   }

}


public class C { 

   public static void main(String[] args) {   

      TempClass temp = new TempClass(1);

   }

}