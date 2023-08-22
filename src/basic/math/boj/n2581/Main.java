package basic.math.boj.n2581;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        //0은 사용X
        //false라면 소수인걸로
        boolean[] sosus = new boolean[n+1]; //0은 사용 X

        sosus[0] = true;
        sosus[1] = true;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (!sosus[i]) {
                for (int j = i + i; j <= n; j += i) {
                    sosus[j] = true;
                }
            }
        }

        int addAll = 0;
        int max = n;

        for (int i = m; i <= n; i++) {
            if (!sosus[i]) {
                addAll += i;
                if (i < max) {
                    max = i;
                }
            }
        }
        if (addAll == 0) {
            System.out.println(-1);
        } else {
            sb.append(addAll).append("\n").append(max);
            System.out.println(sb);
        }
    }
}
