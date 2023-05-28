package basic.boj.n2588;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());

        bw.write(a*(b%10) + "\n");
        bw.write(a*(b%100/10) + "\n");
        bw.write(a*(b/100) + "\n");
        bw.write(a*b + "\n");
        bw.flush();
    }
}
