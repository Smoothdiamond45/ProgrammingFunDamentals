    public class Loops {

    String names[];
    int total = 0;

    public String simpleWhile() {

        String s="";
        int i = 1;
        while (i <= 10){
            s += i+ " ";
            i++;
        }
        return s;
    }
    public void sizeArray(int size){
        names = new String[size];
    }
    public boolean addName(String name){
        this.names[total] = name;
        total++;
        return true;
    }
}

