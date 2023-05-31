package basic.loop.boj.n10951;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String inputStr = "";
        while ((inputStr = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(inputStr);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a+b).append("\n");
        }
        System.out.println(sb.toString());
    }
}
