package basic.string.boj.n27866;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int num = Integer.parseInt(br.readLine());

        System.out.println(word.charAt(num-1));
    }
}
