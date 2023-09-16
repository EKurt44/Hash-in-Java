import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<String>();
        countries.add("Turkey");
        countries.add("USA");
        countries.add("Germany");
        System.out.println(countries);
        System.out.println("List contains Turkey ?: "+countries.contains("Turkey"));
        countries.remove("USA");
        System.out.println(countries);

        // Display message
        System.out.println("Iterating over list:");

        // Iterating over hashSet items
        Iterator<String> i = countries.iterator();

        // Holds true till there is single element remaining
        while (i.hasNext())

            // Iterating over elements
            // using next() method
            System.out.println(i.next());



    }
}
