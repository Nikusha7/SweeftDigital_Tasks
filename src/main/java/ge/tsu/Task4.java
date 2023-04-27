package ge.tsu;

/*
Problem: მოცემულია ორი binary string a და b, დააბრუნეთ მათი ჯამი,
         როგორც binary string.
         მაგ: a = "1010" b = "1011", მათი ჯამი იქნება "10101"
 */

public class Task4 {

    String binaryStringSum(String a, String b) {
        String result = "";

        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        int sum = x + y;
        result = Integer.toBinaryString(sum);

        return result;
    }

    public void binaryStringSum1(String a, String b){
        //String result = "";
        int b1 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);

        int i = 0, carry = 0;

        int[] sum = new int[10];

        while(b1 != 0 || b2 != 0)
        {
            sum[i++] = (b1 % 10 + b2 % 10 + carry) % 2;
            carry    = (b1 % 10 + b2 % 10 + carry) / 2;
            b1 /= 10;
            b2 /= 10;
        }
        if(carry != 0)
        {
            sum[i++] = carry;
        }
        --i;
        System.out.print("Sum of two binary numbers = ");
        while(i >= 0)
        {
            System.out.print(sum[i--]);
        }
        System.out.println();
    }

    public String binaryStringSum2(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0){
            int sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;

        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }



}

