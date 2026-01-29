public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private double temp;
    
    public Person(String firstName, String lastName, int age, double temp)
    {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
     this.temp = temp;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    { 
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    public double getTemp()
    {
        return temp;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setTemp(double temp)
    {
        this.temp = temp;
    }
    public void printFirstname()
    {
        System.out.println(firstName);
    }
    public void printFullName()
    {
        System.out.println(firstName +" " + lastName);
    }
    public void printAge()
    {
        System.out.println(age);
    }
    public void printTemperature()
    {
        System.out.println(temp);
    }
    
    public int happyBirthday()
    {
        int ageincreasebyone;
        ageincreasebyone = age;
        age +=1;
        return ageincreasebyone;
    }
    public static void main(String[] args)
    {
        Person me = new Person("Leonard", "church", 26, 34.5);
        me.printFullName();
        me.printAge();
        System.out.println("Happy Birthday, You were" + me.happyBirthday() + " You are now " + me.age);
   }
}
