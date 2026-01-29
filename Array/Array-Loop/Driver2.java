import java.util.Scanner;


public class Driver2
{
    Loops loops = new Loops();
    Scanner input = new Scanner(System.in);
    public static void main(String args[]){
                new Driver();
    }
    
    public Driver2(){
        System.out.println(loops.simpleWhile());
    }
    
    public void createNames(){
        System.out.println("How many names to enter");
        int namesNum = input.nextInt();
        loops.sizeArray(namesNum);
        getNames(namesNum);
    }
    
    public void getNames(int num){
        input.nextLine();
        for(int i =0; i<num; i++){
            System.out.println("Enter a name");
            String name = input.nextLine();
            if(loops.addName(name))
            System.out.println("Successfully Added");
            else 
            System.out.println("Error adding "+ name);
        }
        
    }
}
