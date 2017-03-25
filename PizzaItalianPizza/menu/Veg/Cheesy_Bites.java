package PizzaItalianPizza.menu.Veg;

import java.io.*;
public class Cheesy_Bites
{
    public static int total=0,cost=0,i,j,n=1;;
    public void Display()throws IOException
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        do
            {
                total=0;
                System.out.println("\tType 1 for Small\tRs.110/-");
                System.out.println("\tType 2 for Medium\tRs.220/-");
                System.out.println("\tType 3 for Large\tRs.330 ");
                j = Integer.parseInt(buff.readLine());
                switch(j)
                {
                    case 1:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*110+"/-");  
                    cost=n*110;
                    break;
                    case 2:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*220+"/-");  
                    cost=n*220;
                    break;
                    case 3:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*330+"/-");  
                    cost=n*330;
                    break;
                    default:
                    System.out.println("\tYou have entered a wrong choice");
                }
                total=total+cost;
                System.out.println("\tPress 1 to buy more Cheesy Bite Pizza's.!!!");
                System.out.println("\tPress any other number to stop buying Cheesy Bite Pizza's..!!!");
                i = Integer.parseInt(buff.readLine());
            }while(i==1);
            System.out.println("\tYour Cheesy Bite total is: " +total);
        }
}



