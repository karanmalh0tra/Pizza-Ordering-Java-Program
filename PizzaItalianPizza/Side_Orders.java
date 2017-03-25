package PizzaItalianPizza;

import java.io.*;
class Side_Orders
 {
   public static int total=0,cost=0,i,j,n=1;;
   public void Display()throws IOException
   {
       BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
       do
       {
       System.out.println("\tSide Orders Available are :");
       System.out.println("\tPress 1 for Veg Pasta Italiano\t\tRs.40");
       System.out.println("\tPress 2 for Garlic BreadSticks\t\tRs.50");
       System.out.println("\tPress 3 for Cheese Jalapeno Dip\t\tRs.20");
       System.out.println("\tPress 4 for Choco Lava Cake\t\tRs.60");
       System.out.println("\tPress 5 for Barbeque Dip\t\tRs.20");
       System.out.println("\tPress 6 for Butterscoth Mousse Cake\tRs.55");
       System.out.println("\tPress 7 for Nonveg Pasta Italiano\tRs.55");
       System.out.println("\tPress 8 for Chicken Wings\t\tRs.100");
       System.out.println("\tPress 9 for Chicken Kickers\t\tRs.120");
       j=Integer.parseInt(buff.readLine());
       switch(j)
       {
           case 1:
           System.out.println("\tEnter the quantity");
           n=Integer.parseInt(buff.readLine());
           cost=n*40;
           break;
           case 2:
           System.out.println("\tEnter the quantity");
           n=Integer.parseInt(buff.readLine());
           cost=n*50;
           break;
           case 3:
           System.out.println("\tEnter the quantity");
           n=Integer.parseInt(buff.readLine());
           cost=n*20;
           break;
           case 4:
           System.out.println("\tEnter the quantity");
           n=Integer.parseInt(buff.readLine());
           cost=n*60;
           break;
           case 5:
           System.out.println("\tEnter the quantity");
           n=Integer.parseInt(buff.readLine());
           cost=n*20;
           break;
           case 6:
           System.out.println("\tEnter the quantity");
           n=Integer.parseInt(buff.readLine());
           cost=n*55;
           break;
           case 7:
           System.out.println("\tEnter the quantity");
           n=Integer.parseInt(buff.readLine());
           cost=n*55;
           break;
           case 8:
           System.out.println("\tEnter the quantity");
           n=Integer.parseInt(buff.readLine());
           cost=n*100;
           break;
           case 9:
           System.out.println("\tEnter the quantity");
           n=Integer.parseInt(buff.readLine());
           cost=n*120;
           break;
           default:
           System.out.println("\tYou have entered a wrong choice");
        }
        total=total+cost;
        System.out.println("\tPress 1 to buy More Side Orders");
        System.out.println("\tPress any other number to Exit");
        i=Integer.parseInt(buff.readLine());
    }while(i==1);
    System.out.println("\tSide Order Bill is "+total);
}
}
       