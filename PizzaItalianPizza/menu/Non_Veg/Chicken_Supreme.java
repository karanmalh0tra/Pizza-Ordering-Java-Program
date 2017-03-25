package PizzaItalianPizza.menu.Non_Veg;

import java.io.*;
public class Chicken_Supreme
{
    public static int total=0,cost=0,i,j,n=1;;
    public void Display()throws IOException
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        do
            {
                total=0;
                System.out.println("\tType 1 for Small\tRs.400/-");
                System.out.println("\tType 2 for Medium\tRs.490/-");
                System.out.println("\tType 3 for Large\tRs.550 ");
                j = Integer.parseInt(buff.readLine());
                switch(j)
                {
                    case 1:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*400+"/-");  
                    cost=n*400;
                    break;
                    case 2:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*490+"/-");  
                    cost=n*490;
                    break;
                    case 3:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*550+"/-");  
                    cost=n*550;
                    break;
                    default:
                    System.out.println("\tYou have entered a wrong choice");
                }
                total=total+cost;
                System.out.println("\tPress 1 to buy more Chicken Supreme Pizza's.!!!");
                System.out.println("\tPress any other number to stop buying Chicken Supreme Pizza's..!!!");
                i = Integer.parseInt(buff.readLine());
            }while(i==1);
            System.out.println("\tYour Chicken Supreme total is: " +total);
        }
}

