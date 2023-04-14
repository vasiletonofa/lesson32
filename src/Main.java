

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(10000000);  // ArrayZ[100000]

        list.add("G"); // 0
        list.add("A"); // 1
        list.add("B"); // 2
        list.add("C"); // 3

        list.add("D"); // 4
        list.add("E"); // 5
        list.add("F"); // 6


        // 1000000
        list.remove(2);
        // +5

        // [0] = A, 1 = [B], [2] - [C].......30[Z]


        // Array[99999999] = "AAA"   O(1)


        list.get(0);   // Array[0]



        // Capul Listei ( Head ) - Vasile
        // Vasile
        // Urmator  - Andrei
        // Precedent - null

        // Capul Listei ( Head ) - Andrei
        // Andrei
        // Urmator  - Ion
        // Precedent - Vasile

        // Capul Listei ( Head ) - Andrei
        // Ion
        // Urmator  - Ion
        // Precedent - Andrei

        // Capul Listei ( Head ) - Andrei
        // Ion
        // Urmator  - null
        // Precedent - Andrei

        // Capul Listei ( Head ) - Andrei
        // Eduard
        // Urmator  - null
        // Precedent - Ion

        // 1000000

        List<String> stringList = new LinkedList<>();
        stringList.add("Ion");
        stringList.add("Vasile");
        stringList.add("Andrei");
        stringList.add("Ion");
        stringList.add("Vasile");
        stringList.add("Vasile");
        stringList.add("Vasile");
        stringList.add("Vasile");
        stringList.add("Vasile");
        stringList.add("Vlad"); // 9     O(n)
        stringList.add("Vasile");
        stringList.add("Eduard");

        stringList.set(5, "Ion");

        stringList.offer("Ion");
        String b = stringList.peek();
        String a = stringList.poll();

        stringList.push("Abc");

        stringList.stream()
                .collect(Collectors.toSet());

        // 1000000000 + 1000000000

        // Adaugare multe date --  LinkedList -   Nu are complexitate de copiere de date vechi din array  --  O(1)
        // Des stergem elementele din Lista --  LinkedList -- Nu trebuie sa schimbam indexurile    --  O(1)
        // La citire de date din Lista --  ArrayList -- Nu trebuie sa parcurga toata lista    --    O(1)


        // BigO notation - criteriu de performanta a codului


        // 1   2   3    - 0
        // 4   5   6    - 1
        // 7   8   9    - 2


        Collections.binarySearch(list, "Vlad");


        queee(stringList);
        dequee(stringList);
        list(new LinkedList<>());

        list(new ArrayList<>());

    }



    public static void queee(Queue<String> queue) {
        queue.poll();
    }

    public static void dequee(Deque<String> queue) {

    }

    public static void list(List<String> queue) {
           queue.get(0);
    }

}