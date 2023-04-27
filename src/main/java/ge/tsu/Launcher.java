package ge.tsu;

public class Launcher {

    public static void main(String[] args) {

        int nums[] = {4, 223, 3, 14, 12, 2, 6, 19, -7, 4, 5, 6, 12, -7, 223, 12, 14, 3, 12, 2, 5};
        Launcher launcher = new Launcher();

        Task1 task1 = new Task1();

        System.out.println("Task1: sorting and then looking for single number: " + task1.findSingleNumber1(nums));
        System.out.println("Task1: using hashset: " + task1.findSingleNumber2(nums));
        System.out.println("Task1: using hashmap: " + task1.findSingleNumber3(nums));

        Task2 task2 = new Task2();

        System.out.println("Task2: Minimum number of coins: " + task2.minSplit1(238));
        System.out.println("Task2: Minimum number of coins:(easier code) " + task2.minSplit2(238));


        int[] wholeNumbers = {4, 223, 3, 14, 12, 1, 2, 1, 6, 19, 4, 5, 6, 12, 223, 12, 14, 3, 12, 2, 5};
        Task3 task3 = new Task3();
        System.out.println("Minimum number which is more then 0 and isn't contained in array is: " + task3.notContains1(wholeNumbers));
        System.out.println("Minimum number which is more then 0 and isn't contained in array is: " + task3.notContains2(wholeNumbers));
        System.out.println(task3.notContains(wholeNumbers));


        Task4 task4 = new Task4();

        System.out.println("Sum of two binary numbers is: "+ task4.binaryStringSum("1010", "1011"));

        task4.binaryStringSum1("1010", "1011");
        System.out.println("sum: "+task4.binaryStringSum2("1010", "1011"));

    }


}
