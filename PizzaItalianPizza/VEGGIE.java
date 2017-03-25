package PizzaItalianPizza;
import PizzaItalianPizza.menu.Veg.*;
import java.io.*;
public class VEGGIE
{
public int j,i,cost,total=0;
public void Display()throws IOException
{
BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("\tDifferent Items Available in Veg Section with us are-");
System.out.println("\t1.Margherita");
System.out.println("\t2.Virtuous Veg");
System.out.println("\t3.Portobello Blue");
System.out.println("\t4.Heavenly Veg");
System.out.println("\t5.Thin Italian");
System.out.println("\t6.Cheesy Bites");
System.out.println("\t7.Stuffed Crust");
System.out.println("\t8.Veggie Supreme");
System.out.println("\t9.Spicy Hot Vegie");
System.out.println("\t10.Blazin Inferno");
System.out.println("\tPlease choose the option you want -");
j = Integer.parseInt(buff.readLine());
switch(j)
{
    case 1:
    Margherita objMar= new Margherita();
    objMar.Display();
    cost = objMar.total;
    break;
    case 2:
    Virtuous_Veg objVV = new Virtuous_Veg();
    objVV.Display();
    cost = objVV.total;
    break;
    case 3:
    Portobello_Blue objPB= new Portobello_Blue();
    objPB.Display();
    cost = objPB.total;
    break;
    case 4:
    Heavenly_Veg objHV =new Heavenly_Veg();
    objHV.Display();
    cost = objHV.total;
    break;
    case 5:
    Thin_Italian objTI = new Thin_Italian();
    objTI.Display();
    cost = objTI.total;
    break;
    case 6:
    Cheesy_Bites objCB = new Cheesy_Bites();
    objCB.Display();
    cost = objCB.total;
    break;
    case 7:
    Stuffed_Crust objSC = new Stuffed_Crust();
    objSC.Display();
    cost = objSC.total;
    break;
    case 8:
    Veggie_Supreme objVS = new Veggie_Supreme();
    objVS.Display();
    cost = objVS.total;
    break;
    case 9:
    Spicy_Hot_Vegie objSHV = new Spicy_Hot_Vegie();
    objSHV.Display();
    cost = objSHV.total;
    break;
    case 10:
    Blazin_Inferno objBI = new Blazin_Inferno();
    objBI.Display();
    cost = objBI.total;
    break;
    default:
    System.out.println("\tYou have entered a wrong choice");
}
total = total + cost;
System.out.println("\tPress 1 to continue in VEGGIE SECTION");
System.out.println("\tPress any other key to exit");
i = Integer.parseInt(buff.readLine());
}while(i==1);
}
}

