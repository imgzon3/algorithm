package basic.array.onedimension.boj.n5597;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[30];

        for (int i=0; i<28; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num-1] = 1;
        }

        for (int i=0; i<30; i++) {
            if (count[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}
