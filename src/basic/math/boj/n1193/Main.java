package basic.math.boj.n1193;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int when = 1;

        while (true) {
            num -= when;

            if (num <= 0) {
                if (when%2 == 0) {
                    System.out.println((when+num) + "/" + (1-num));
                }
                else {
                    System.out.println(1-num + "/" + (when+num));
                }
                break;
            }
            else {
                when++;
            }
        }
    }
}
