
public class FortuneTeller
{
    public void sayRandomFortune(){
        System.out.println("You will get great");
    }
    public void personalFortune(String name){
        System.out.println("You " + name +" you will get great good");
    }
    public String futurePrediction(int age){
        int futureAge = age +10;
        return "Congrats you are " + futureAge + " and still alive and paying taxes";
    }
}
