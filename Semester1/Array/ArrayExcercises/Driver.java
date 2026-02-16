import java.util.*;
public class Driver
{
    int[] numbers;
    double[] wages;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        new Driver();
    }
    public Driver()
    {
       excercise1();
       excercise2();
       excercise3();
       excercise4();
       excercise5();
       excercise6();
       excercise7();
       excercise8();
       
    }
    public void excercise1()
    {
        numbers = new int[6];
        System.out.println("Please enter 6 numbers");
        for(int i =0; i<6; i++){
            numbers[i] = input.nextInt();
        } 
        for(int i=0;i<numbers.length; i++){
            System.out.println("Value :" + numbers[i]);
        }
    }
    public void excercise2()
    {
        //Reversing an array with ints
        int[] numbers = new int[6];
        System.out.println("Please enter 6 numbers");
        for (int i=0; i <numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        for(int i = numbers.length-1;i>=0; i--){
            System.out.println("Value :" + numbers[i]);
        }
    }
     public void excercise3()
    {
        numbers = new int[6];
        System.out.println("Please enter 6 numbers");
        for(int i =0; i<6; i++){
            numbers[i] = input.nextInt();
            numbers[i]++;
        }   
         for(int i=0;i<numbers.length; i++){
            System.out.println("Value :" + numbers[i]);
        }  
    }
    public void excercise4()
    {
        wages = new double[10];
        System.out.println("Please enter 10 wages");
        for(int i=0; i<10; i++){
            wages[i] = input.nextDouble();
        }   
         for(int i=0;i<wages.length; i++){
            System.out.println("Wage :" + wages[i]);
        }  
    }
     public void excercise5()
    {
        wages = new double[10];
        System.out.println("Please enter 10 wages");
        for(int i=0; i<10; i++){
            wages[i] = input.nextDouble();
        }   
         for(int i=0;i<wages.length; i++){
             if (wages[i]>=100){
            System.out.println("Wage :" + wages[i]);
            }
        }
   
    }
    public void excercise6()
    {
        wages = new double[10];
        System.out.println("Please enter 10 wages");
        for(int i=0; i<10; i++){
            wages[i] = input.nextDouble();
        }   
         for(int i=0;i<wages.length; i++){
             if (wages[i]>=1000){
                double wagesresult = wages[i] * 0.9; 
            System.out.println("Wage with reduction :" + wagesresult);
            }
            else{
                System.out.println("Normal Wage : " +wages[i]);
            }
        }
   
    }
    public void excercise7()
    {
        wages = new double[10];
        System.out.println("Please enter 10 wages");
        int sum = 0;
        float avg;
        for(int i=0; i<10; i++){
            wages[i] = input.nextDouble(); 
        }   
         for(int i=0;i<wages.length; i++){
             System.out.println("Wages : " +wages[i]);
        }
        for(double wage : wages){
            sum += wage;
        }
        avg = sum / wages.length;
        System.out.println("The average wage is : " +avg);
        //w3school 
   
    }
    public void excercise8()
    {
        wages = new double[10];
        System.out.println("Please enter 6 wages");
        double small = 0;
        for(int i=0; i<3; i++){
            wages[i] = input.nextDouble(); 
        }   
        for(int i=0;i<wages.length; i++){
             System.out.println("Wages : " +wages[i]);
        }
        for (int i=0;i<wages.length; i++){
            if (wages[i] > small){
                small = wages[i];
            }
        }
        System.out.println("Biggest Wage is :" + small);
   
    }
     public void exercise10() {
        int size = 5 ;
        String[] name = new String[size];
        System.out.println("Excercise 10");

        for (int i = 0; i<size ; i++) {
            System.out.print("Enter  your name please (" + (i+1) + "): ");
            name[i] = input.next();
        }

        for (int i = 0; i<size ; i++) {
            System.out.println("Name at index " + i  + " is : " + name[i]);
        }

    }
    
}
//correct version
/*public void exercise1() {
        System.out.println("Exercise 1: reads in 6 integers into an integer array and prints the values to the screen.");

        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print("Enter value : ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("value " + (i+1)  + " is: " + numbers[i]);
        }
    }*/