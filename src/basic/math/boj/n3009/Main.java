package basic.math.boj.n3009;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        if (x[0] == x[1]) {
            sb.append(x[2]).append(" ");
        } else if (x[1] == x[2]) {
            sb.append(x[0]).append(" ");
        } else {
            sb.append(x[1]).append(" ");
        }

        if (y[0] == y[1]) {
            sb.append(y[2]);
        } else if (y[1] == y[2]) {
            sb.append(y[0]);
        } else {
            sb.append(y[1]);
        }

        System.out.println(sb);
    }
}