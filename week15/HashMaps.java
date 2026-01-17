

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        Map<Integer, Integer> studentMarks = new HashMap<>();

        studentMarks.put(101, 85);
        studentMarks.put(102, 90);
        studentMarks.put(103, 78);
        studentMarks.put(104, 90);

        studentMarks.put(102, 95);

        System.out.println("Marks of roll no 102: " + studentMarks.get(102));

        System.out.println("Marks of roll no 110: " + studentMarks.get(110));

        System.out.println("Contains roll no 101? " + studentMarks.containsKey(101));
        System.out.println("Contains roll no 110? " + studentMarks.containsKey(110));

        studentMarks.remove(103);

        System.out.println("Total students: " + studentMarks.size());
        System.out.println("Is map empty? " + studentMarks.isEmpty());

        System.out.println("\nIterating using keySet():");
        for (Integer rollNo : studentMarks.keySet()) {
            System.out.println("Roll No: " + rollNo);
        }

        System.out.println("\nIterating using values():");
        for (Integer marks : studentMarks.values()) {
            System.out.println("Marks: " + marks);
        }

        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
            System.out.println("Roll No " + entry.getKey() + " → Marks " + entry.getValue());
        }
    }
}
