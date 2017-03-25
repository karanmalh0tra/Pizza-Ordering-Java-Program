package PizzaItalianPizza.menu.Combo;
import java.io.*;
public class Combo_Offers
 {
     public static int i=1,a,cost=0,total=0,n;
     public void Display() throws IOException
     {
         
         BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Welcome to Combo Offers ");
         do
         {
         System.out.println("Press 1 for Veg Combo ");
         System.out.println("Press 2 for Non Veg Combo ");
         int j=Integer.parseInt(buff.readLine());
         switch(j)
         {
             case 1:
             total=0;
             System.out.println("Welcome to Veg Combo's");
             System.out.println("1)Buy Medium Margherita and get Extra Cheese and Coke\t\t\t\t Rs.180 ");
             System.out.println("2)Medium Virtous Veg and Small Thin Italian\t\t\t\t\t Rs.150");
             System.out.println("3)Large Stuffed Crust, Portobello Blue,Coke and Thin Italian\t\t\t Rs.480");
             System.out.println("4)Medium Cheesy Bites,Small Spicy Hot Veggie,Coke and Ginger Garlic Bread\t Rs.390");
             a=Integer.parseInt(buff.readLine());
             switch(a)
             {
                 case 1: System.out.println("Enter the quantity");
                 n=Integer.parseInt(buff.readLine());
                 cost=n*180;
                 break;
                 case 2: System.out.println("Enter the quantity");
                 n=Integer.parseInt(buff.readLine());
                 cost=n*150;
                 break;
                 case 3: System.out.println("Enter the quantity");
                 n=Integer.parseInt(buff.readLine());
                 cost=n*480;
                 break;
                 case 4: System.out.println("Enter the quantity");
                 n=Integer.parseInt(buff.readLine());
                 cost=n*390;
                 break;
                 default: System.out.println("Enter a number from 1 to 4 ");
                 break;
                }
                break;
                case 2:
                total=0;
                System.out.println("Welcome to Non Veg Combo's");
                System.out.println("1)Small Chicken Delight with Extra Cheese and Coke\t\tRs.200");
                System.out.println("2)Medium Farmhouse, Coke and Ginger Garlic Bread\t\tRs.280");
                System.out.println("3)Large BBQ Americano,Medium Hawaiin and Coke\t\t\tRs.600");
                System.out.println("4)Medium King Of The Coast with Chocolate Mouse\t\t\tRs.370");
                a=Integer.parseInt(buff.readLine());
                switch(a)
                {
                 case 1: System.out.println("Enter the quantity");
                 n=Integer.parseInt(buff.readLine());
                 cost=n*200;
                 break;
                 case 2: System.out.println("Enter the quantity");
                 n=Integer.parseInt(buff.readLine());
                 cost=n*280;
                 break;
                 case 3: System.out.println("Enter the quantity");
                 n=Integer.parseInt(buff.readLine());
                 cost=n*600;
                 break;
                 case 4: System.out.println("Enter the quantity");
                 n=Integer.parseInt(buff.readLine());
                 cost=n*370;
                 break;
                 default: System.out.println("Enter a number from 1 to 4 ");
                 break;
                }
                break;
                default:System.out.println("Enter 1 for Veg and 2 for Non Veg");
                break;
                
            }
                total=total+cost;
                System.out.println("Press 1 to buy more Combo Pizza's.!!!");
                System.out.println("Press any other key to stop buying From Daily Combo Section..!!!");
                i = Integer.parseInt(buff.readLine());
            }while(i==1);
            System.out.println("Your Combo Total is "+total);
        }
    }


                
                 
                 
             

