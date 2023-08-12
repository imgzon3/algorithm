package basic.math.boj.n2292;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()) - 1;

        int result = 1;
        int temp = 6;
        while (true) {
            if (num <= 0) {
                break;
            }
            else {
                result++;
                num -= temp;
                temp += 6;
            }
        }

        System.out.println(result);
    }
}
