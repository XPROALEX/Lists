//-Define a testing class with a main() method where you:
// -Create a not mutable List of strings called cityNames using asList() that you populate with 3 city names
// -Try to add a 4th city name at the end of the List -If you get an exception,
// try to understand why and eventually comment the faulty code
// -Try to change the 2nd item of the array, entering the value Tegucigalpa print the content of cityNames
// -Define a mutable empty List of strings called kingsOfRome -Insert the names of the 7 kings of Rome into the mutable list
// -Print the content of kingsOfRome -Convert kingsOfRome into an array called kingsOfRomeArray, using new String[0] to determine the type of the array
// -.Change the value of the 7th king in kingsOfRomeArray with the value Lucius Tarquinius Supercar
//        Print the content of kingsOfRomeArray
import java.util.*;

public class testing {
    public static void main(String[] args) {
        List<String> cityNames= Arrays.asList("Napoli","Milano","Napoli");
        System.out.println(cityNames);
        //cityNames.add("Torino");
        //System.out.println(cityNames);//usando il comando Arrays.asList creaiamo una lista con un numerico ben  definito
        cityNames.set(1,"Tegucigalpa");
        System.out.println(cityNames);
    }
        }
