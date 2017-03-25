package PizzaItalianPizza;
import PizzaItalianPizza.menu.Combo.*;
import java.io.*;
class ComboSection
 {
     public int j,i,cost,total=0;
     public void Display()throws IOException
     {
         BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
         do
         {
         System.out.println("\t Select the Combo Offer you want ");
         System.out.println("\t 1) Daily Combo");
         System.out.println("\t 2) General Combo");
         j=Integer.parseInt(buff.readLine());
         switch(j)
         {
             case 1: Daily_Combo objDaily=new Daily_Combo();
             objDaily.Display();
             cost = objDaily.total;
             break;
             case 2: Combo_Offers objOffers=new Combo_Offers();
             objOffers.Display();
             cost=objOffers.total;
             break;
             default:
             System.out.println("\tPlease type 1 or 2 ");
             break;
            }
            total=total+cost;
            System.out.println("\tPress 1 to continue in COMBO SECTION");
            System.out.println("\tPress any other key to exit");
            i = Integer.parseInt(buff.readLine());
         } while(i==1);
        System.out.println("\tYour bill from Combo's is " +total);
    }   
}
             
     