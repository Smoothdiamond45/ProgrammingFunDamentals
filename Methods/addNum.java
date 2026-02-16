
public class addNum
{
    public String addingNumber(int num1, int num2, int num3){
        int answer = num1+num2+num3;
        return num1 + " + " + num2 + " + "  + num3 + " = "  + answer;
    }
    public String multiplyNumber(int num1, int num2, int num3){
        int answer = num1*num2*num3;
        return num1 + " * " + num2 + " * "  + num3 + " = " + answer;
    }
    public String biggestNumber(int num1, int num2, int num3){
        int biggest = num1;
        if (num2 > biggest){
            biggest = num2;
        }
        if (num3>biggest){
            biggest = num3;
        }
        return "the max of " + num1 + ", " +num2 + ", " +num3 + " = " + biggest;
    }
}
