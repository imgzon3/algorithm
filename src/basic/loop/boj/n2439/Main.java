package basic.loop.boj.n2439;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i=1; i<=count; i++) {
            for(int k=1; k<=(count-i); k++) {
                bw.write(" ");
            }
            for(int k=1; k<=i; k++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
    }
}
