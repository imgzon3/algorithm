package basic.string.boj.n2675;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i=0; i<num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int tempNum = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for (int k=0; k<word.length(); k++) {
                sb.append(word.substring(k, k+1).repeat(tempNum));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
