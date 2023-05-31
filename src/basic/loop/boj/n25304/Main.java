package basic.loop.boj.n25304;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputResult = Integer.parseInt(br.readLine());
        int addResult = 0;
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int price = Integer.parseInt(st.nextToken());
            int count2 = Integer.parseInt(st.nextToken());

            addResult += price * count2;
        }

        System.out.println((inputResult == addResult) ? "Yes" : "No");
    }
}
