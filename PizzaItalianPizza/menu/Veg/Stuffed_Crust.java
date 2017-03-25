package PizzaItalianPizza.menu.Veg;

import java.io.*;
public class Stuffed_Crust
{
    public static int total=0,cost=0,i,j,n=1;;
    public void Display()throws IOException
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        do
            {
                total=0;
                System.out.println("\tType 1 for Small\tRs.255/-");
                System.out.println("\tType 2 for Medium\tRs.435/-");
                System.out.println("\tType 3 for Large\tRs.555 ");
                j = Integer.parseInt(buff.readLine());
                switch(j)
                {
                    case 1:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*255+"/-");  
                    cost=n*255;
                    break;
                    case 2:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("Rs."+n*435+"/-");  
                    cost=n*435;
                    break;
                    case 3:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*555+"/-");  
                    cost=n*555;
                    break;
                    default:
                    System.out.println("\tYou have entered a wrong choice");
                }
                total=total+cost;
                System.out.println("\tPress 1 to buy more Stuffed Crust Pizza's.!!!");
                System.out.println("\tPress any other number to stop buying Stuffed Crust Pizza's..!!!");
                i = Integer.parseInt(buff.readLine());
            }while(i==1);
            System.out.println("\tYour Stuffed Crust total is: " +total);
        }
}



