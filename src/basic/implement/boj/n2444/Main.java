package basic.implement.boj.n2444;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        for (int i=1; i<=num; i++) {
            bw.write(" ".repeat(num-i));
            bw.write("*".repeat(i*2-1));
            bw.write("\n");
        }
        for (int i=1; i<num; i++) {
            bw.write(" ".repeat(i));
            bw.write("*".repeat((num-i)*2-1));
            bw.write("\n");
        }

        bw.flush();
    }
}
