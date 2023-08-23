package basic.math.boj.n9063;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int xLen = Arrays.stream(x).max().getAsInt() - Arrays.stream(x).min().getAsInt();
        int yLen = Arrays.stream(y).max().getAsInt() - Arrays.stream(y).min().getAsInt();

        System.out.println(xLen*yLen);

    }
}