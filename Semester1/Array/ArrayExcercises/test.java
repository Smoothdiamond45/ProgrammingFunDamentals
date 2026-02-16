import java.util.*;
public class test
{
    Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        new test();
    }
    public test()
    {
       excercise1();
       
    }
    public void excercise1()
    {
        int size = 5 ;
        String[] name = new String[size];
        

        for (int i = 0; i<size ; i++) {
            System.out.print("Enter  your name please (" + (i+1) + "): ");
            name[i] = input.next();
            String Uppername = input.toUpperCase();
        }

        for (int i = 0; i<size ; i++) {
            System.out.println("Your name is :" + Uppername);
        }
    }
}