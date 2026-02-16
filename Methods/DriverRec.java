import java.util.*;
public class DriverRec
{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        double arearesult = 0.0;
        double perimeterresult = 0.0;
        
        arearesult = 5.0*3.0;
        rec.area(arearesult);
        
        perimeterresult = 10.0+6.0;
        rec.perimeter(perimeterresult);
    }
}
