package basic.math.boj.n2903;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println((int) Math.pow(Math.pow(2, num)+1, 2));
    }
}
