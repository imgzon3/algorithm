package basic.math.boj.n11653;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        if (n>1) {
            int temp = 2;
            while (true) {
                if (n == 1) {
                    break;
                } else if (n % temp == 0) {
                    sb.append(temp).append("\n");
                    n /= temp;
                } else {
                    temp++;
                }
            }
            System.out.println(sb);
        }

    }
}
