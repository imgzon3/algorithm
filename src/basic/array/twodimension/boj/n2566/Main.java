package basic.array.twodimension.boj.n2566;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int y = 0;
        int result = -1;

        for (int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int k=0; k<9; k++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > result) {
                    result = num;
                    x = i+1;
                    y = k+1;
                }
            }
        }

        sb.append(result).append("\n").append(x).append(" ").append(y);
        System.out.println(sb);
    }
}
