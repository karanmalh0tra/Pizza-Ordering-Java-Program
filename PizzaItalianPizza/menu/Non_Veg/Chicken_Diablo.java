package PizzaItalianPizza.menu.Non_Veg;

import java.io.*;
public class Chicken_Diablo
{
    public static int total=0,cost=0,i,j,n=1;;
    public void Display()throws IOException
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        do
            {
                total=0;
                System.out.println("\tType 1 for Small\tRs.350/-");
                System.out.println("\tType 2 for Medium\tRs.480/-");
                System.out.println("\tType 3 for Large\tRs.600 ");
                j = Integer.parseInt(buff.readLine());
                switch(j)
                {
                    case 1:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*350+"/-");  
                    cost=n*350;
                    break;
                    case 2:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("Rs."+n*480+"/-");  
                    cost=n*480;
                    break;
                    case 3:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*600+"/-");  
                    cost=n*600;
                    break;
                    default:
                    System.out.println("\tYou have entered a wrong choice");
                }
                total=total+cost;
                System.out.println("\tPress 1 to buy more Chicken Diablo Pizza's.!!!");
                System.out.println("\tPress any other number to stop buying Chicken Diablo Pizza's..!!!");
                i = Integer.parseInt(buff.readLine());
            }while(i==1);
            System.out.println("\tYour Chicken Diablo total is: " +total);
        }
}

