package collectionFrameworks;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public static void main(String[] args) {
    Map<String, String> cc = new HashMap<>();
    cc.put("Kenya", "Nairobi");
    cc.put("SA", "Cape Town");
    cc.put("Canada", "Ottawa");
    cc.put("France", "Paris");
    cc.put("UAE", "Abu Dhabi");
    System.out.println(cc);
    for(Map.Entry<String, String> entry : cc.entrySet()) {
        System.out.println(entry.getKey());
    }

    Map<String, Double> price = new HashMap<>();
    price.put("Apple", 0.55);
    price.put("Bread", 1.50);
    price.put("Eggs", 7.00);
    price.put("Milk", 4.50);
    price.put("Apple", 2.99);

    price.remove("Sugar");
    for(Map.Entry<String, Double> pr : price.entrySet()) {
        System.out.println(pr.getKey() + " " + pr.getValue());
    }

    System.out.println(price.get("Apple"));
    System.out.println(price.containsKey("Eggs") + " - checking if we have eggs");

    }
}
