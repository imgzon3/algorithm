package basic.math.boj.n1978;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;

        for (int i = 0; i < n; i++) {
            int tempNum = Integer.parseInt(st.nextToken());
            if (tempNum != 1) {
                result++;
                for (int k = 2; k <= Math.sqrt(tempNum); k++) {
                    if (tempNum % k == 0) {
                        result--;
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
