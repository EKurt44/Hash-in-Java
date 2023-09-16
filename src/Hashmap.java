import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> languages = new HashMap<>();
        languages.put("python",1);
        languages.put("java",2);
        languages.put("c++",3);
        languages.put("javascript",4);
        languages.put("C",5);
        System.out.println("HashMap: " + languages);
        System.out.println(languages.get("java"));
        System.out.println("Keys: "+languages.keySet());
        System.out.println("Values: "+languages.values());
        System.out.println("Key/Value mappings :"+languages.entrySet());

        languages.replace("java",6);
        System.out.println("Key/Value mappings :"+languages.entrySet());
        languages.remove("python");
        System.out.println("Key/Value mappings :"+languages.entrySet());

        // iterate through keys only
        System.out.print("Keys: ");
        for (String key : languages.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }

        // iterate through values only
        System.out.print("\nValues: ");
        for (Integer value : languages.values()) {
            System.out.print(value);
            System.out.print(", ");
        }

        // iterate through key/value entries
        System.out.print("\nEntries: ");
        for (Entry<String, Integer> entry : languages.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }


    }
}
