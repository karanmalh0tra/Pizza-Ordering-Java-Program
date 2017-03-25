package PizzaItalianPizza;
import PizzaItalianPizza.menu.Non_Veg.*;
import java.io.*;
public class NonVegSection
{
public int j,i,cost,total=0;
public void Display()throws IOException
{
BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("\tNON VEG PIZZA AVAILABLE ARE:");
System.out.println("\t1.Chicken Delight");
System.out.println("\t2.Chicken Diablo");
System.out.println("\t3.Shrimply Delicious");
System.out.println("\t4.Posh Prosciutto");
System.out.println("\t5.King of the Coast");
System.out.println("\t6.Farmhouse");
System.out.println("\t7.Chicken Supreme");
System.out.println("\t8.Meat Feast");
System.out.println("\t9.Hawaiin");
System.out.println("\t10.BBQ Americano");
System.out.println("\tPlease choose the option you want -");
j = Integer.parseInt(buff.readLine());
switch(j)
{
    case 1:
    Chicken_Delight objCD= new Chicken_Delight();
    objCD.Display();
    cost = objCD.total;
    break;
    case 2:
    Chicken_Diablo objDiablo = new Chicken_Diablo();
    objDiablo.Display();
    cost = objDiablo.total;
    break;
    case 3:
    Shrimply_Delicious objSD= new Shrimply_Delicious();
    objSD.Display();
    cost = objSD.total;
    break;
    case 4:
    Posh_Prosciutto objPP =new Posh_Prosciutto();
    objPP.Display();
    cost = objPP.total;
    break;
    case 5:
    King_of_the_Coast objKOTC = new King_of_the_Coast();
    objKOTC.Display();
    cost = objKOTC.total;
    break;
    case 6:
    Farmhouse objFarmhouse = new Farmhouse();
    objFarmhouse.Display();
    cost = objFarmhouse.total;
    break;
    case 7:
    Chicken_Supreme objCS = new Chicken_Supreme();
    objCS.Display();
    cost = objCS.total;
    break;
    case 8:
    Meat_Feast objMF = new Meat_Feast();
    objMF.Display();
    cost = objMF.total;
    break;
    case 9:
    Hawaiin objHawaiin = new Hawaiin();
    objHawaiin.Display();
    cost = objHawaiin.total;
    break;
    case 10:
    BBQ_Americano objBBQ = new BBQ_Americano();
    objBBQ.Display();
    cost = objBBQ.total;
    break;
    default:
    System.out.println("\tYou have entered a wrong choice");
}
total = total + cost;
System.out.println("\tPress 1 to continue in NON-VEG SECTION");
System.out.println("\tPress any other key to exit");
i = Integer.parseInt(buff.readLine());
}while(i==1);
}
}

