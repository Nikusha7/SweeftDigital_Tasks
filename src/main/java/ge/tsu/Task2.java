package ge.tsu;

/*
Problem: გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხმა (თეთრებში)
         და აბრუნებს მონეტების მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა დავახურდაოთ.
         Int minSplit(Int amount);
 */

public class Task2 {

    public int minSplit1(int amount) {
        int result = 0;
        int coinFifty = 0;
        int coinTwenty = 0;
        int coinTen = 0;
        int coinFive = 0;
        int coinOne = 0;
        System.out.println(amount + " Tetri will be divided/splitted in this way:");
        while (amount != 0) {
            if (amount >= 50) {
                amount -= 50;
                result++;
                coinFifty++;
            } else if (amount >= 20) {
                amount -= 20;
                result++;
                coinTwenty++;
            } else if (amount >= 10) {
                amount -= 10;
                result++;
                coinTen++;
            } else if (amount >= 5) {
                amount -= 5;
                result++;
                coinFive++;
            } else if (amount >= 1) {
                amount -= 1;
                result++;
                coinOne++;
            }
        }

        System.out.println("50 coin: " + coinFifty + "\n20 coin: " + coinTwenty + "\n10 coin: " + coinTwenty + "\n5 coin: " + coinTen + "\n1 coin: " + coinOne);

        return result;
    }

    public int minSplit2(int amount) {
        int coins[] = {50, 20, 10, 5, 1};
        int count = 0;

        for (var coin : coins) {
            count += amount / coin;
            amount %= coin;
        }

        return count;
    }


}
