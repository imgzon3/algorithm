package basic.math.boj.n2501;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean tf = true;

        int counter = 0;
        for (int i=1; i<=n; i++) {
            if (n%i == 0) {
                counter++;
            }
            if (k == counter) {
                System.out.println(i);
                tf = false;
                break;
            }
        }
        if (tf) {
            System.out.println(0);
        }

    }
}
