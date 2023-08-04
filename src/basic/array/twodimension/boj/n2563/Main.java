package basic.array.twodimension.boj.n2563;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        boolean[][] paper = new boolean[101][101];

        for (int i=0; i<num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int y1=y; y1<y+10; y1++) {
                for (int x1=x; x1<x+10; x1++) {
                    paper[100-y1][x1] = true;
                }
            }
        }
        int result = 0;
        for (int i=1; i<101; i++) {
            for (int k=1; k<101; k++) {
                if (paper[i][k]) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
