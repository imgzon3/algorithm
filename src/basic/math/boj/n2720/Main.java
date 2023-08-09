package basic.math.boj.n2720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i=0; i<num; i++) {
            int money = Integer.parseInt(br.readLine());
            sb.append(money/25).append(" ");
            sb.append(money%25/10).append(" ");
            sb.append(money%25%10/5).append(" ");
            sb.append(money%5).append("\n");
        }

        System.out.print(sb);
    }
}
