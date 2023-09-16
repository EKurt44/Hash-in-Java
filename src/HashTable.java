import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("GS",1);
        hashtable.put("FB",2);
        hashtable.put("BJK",3);
        hashtable.put("TS",4);
hashtable.put("TS",5);
hashtable.put("SS",3);
        System.out.println(hashtable.get("GS"));
        hashtable.remove("FB");

        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }



        // iterate through keys only
        System.out.print("Keys: ");
        for (String key : hashtable.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }

        // iterate through values only
        System.out.print("\nValues: ");
        for (Integer value : hashtable.values()) {
            System.out.print(value);
            System.out.print(", ");
        }

        // iterate through key/value entries
        System.out.print("\nEntries: ");
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }
    }
}
