
/**
 * Write a description of class UseCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UseCalculator extends Calculator
{
    // instance variables - replace the example below with your own
    private Calculator calculate;
    private int a;
    private int b;
    private int c;
public UseCalculator()
{
    calculate = new Calculator();
}
public void calculate(int a, int b, int c)
{
       System.out.println(a+b+c);
    }}