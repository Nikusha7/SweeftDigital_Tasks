package ge.tsu;

import java.util.HashMap;
import java.util.HashSet;

/*
Problem: მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. დაწერეთ ფუნქცია რომელსაც გადაეცემა ეს მასივი
         და აბრუნებს მინიმალურ მთელ რიცხვს, რომელიც 0-ზე მეტია და ამ მასივში არ შედის.
         Int notContains(Int[] array);
 */

public class Task3 {
    //using hashset
    public int notContains1(int[] array) {
        HashSet<Integer> hashset = new HashSet<>();
        for (var numb : array) {
            hashset.add(numb);
        }
        int i = 1;
        while (true) {
            if (!hashset.contains(i)) {
                return i;
            }
            i++;
        }

    }

    //using hashmap
    public int notContains2(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (var numbs : array) {
            hashMap.put(numbs, 1);
        }
        int i = 1;
        while (true) {
            if (!hashMap.containsKey(i)) {
                return i;
            }
            i++;
        }
    }

    //with array
    public static int notContains(int[] array){
        boolean[] arr = new boolean[array.length];
        for(int a: array){
            if(a > 0 && a <= array.length){
                arr[a - 1] = true;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(!arr[i]) return i + 1;
        }
        return arr.length + 1;
    }

}
