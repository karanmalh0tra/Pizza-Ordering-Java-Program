package PizzaItalianPizza.menu.Veg;

import java.io.*;
public class Spicy_Hot_Vegie
{
    public static int total=0,cost=0,i,j,n=1;;
    public void Display()throws IOException
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        do
            {
                total=0;
                System.out.println("\tType 1 for Small\tRs.215/-");
                System.out.println("\tType 2 for Medium\tRs.330/-");
                System.out.println("\tType 3 for Large\tRs.425 ");
                j = Integer.parseInt(buff.readLine());
                switch(j)
                {
                    case 1:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*215+"/-");  
                    cost=n*215;
                    break;
                    case 2:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*330+"/-");  
                    cost=n*330;
                    break;
                    case 3:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*425+"/-");  
                    cost=n*425;
                    break;
                    default:
                    System.out.println("\tYou have entered a wrong choice");
                }
                total=total+cost;
                System.out.println("\tPress 1 to buy more Spicy Hot Veggie Pizza's.!!!");
                System.out.println("\tPress any other number to stop buying Spicy Hot Veggie Pizza's..!!!");
                i = Integer.parseInt(buff.readLine());
            }while(i==1);
            System.out.println("\tYour Spicy Hot Veggie total is: " +total);
        }
}



