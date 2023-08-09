package basic.math.boj.n11005;

import java.io.*;
import java.util.*;

//풀었던 첫 번째 방법
//최대 자리수를 먼저 구하고, 높은 자리수부터 구함
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        long origin = Integer.parseInt(st.nextToken());
        long jinBub = Integer.parseInt(st.nextToken());

        long num = 1; //자리수
        long temp = jinBub;
        while (true) {
            if (temp>origin) {
                break;
            }
            temp *= jinBub;
            num += 1;
        }
        temp /= jinBub;

        for (int i=0; i<num; i++) {
            long tempNum = origin/temp;
            if (tempNum>9) {
                sb.append((char) ('A'+tempNum-10));
            }
            else {
                sb.append(tempNum);
            }
            origin %= temp;
            temp /= jinBub;
        }

        System.out.println(sb);
    }
}
