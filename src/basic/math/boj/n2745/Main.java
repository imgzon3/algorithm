package basic.math.boj.n2745;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String word = st.nextToken();
        int jinsu = Integer.parseInt(st.nextToken());

        int result = 0;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            int temp = word.charAt(length - i - 1);
            if ('A' <= temp && temp <= 'Z') {
                temp += 10 - 'A';
            } else {
                temp -= '0';
            }
            result += temp * Math.pow(jinsu, i);
        }

        System.out.println(result);
    }
}
