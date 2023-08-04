package basic.array.twodimension.boj.n10798;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[5][15];

        for (int i=0; i<5; i++) {
            String temp = br.readLine();
            for (int k=0; k<temp.length(); k++) {
                arr[i][k] = temp.charAt(k);
            }
        }

        for (int k=0; k<15; k++) {
            for (int i=0; i<5; i++) {
                if (arr[i][k] == '\0') {
                    continue;
                }
                sb.append(arr[i][k]);
            }
        }

        System.out.println(sb);
    }
}
