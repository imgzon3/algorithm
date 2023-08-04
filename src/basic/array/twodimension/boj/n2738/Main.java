package basic.array.twodimension.boj.n2738;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] num1 = new int[n][m];
        int[][] num2 = new int[n][m];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k=0; k<m; k++) {
                num1[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k=0; k<m; k++) {
                num2[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<n; i++) {
            for (int k=0; k<m; k++) {
                sb.append(num1[i][k] + num2[i][k]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
