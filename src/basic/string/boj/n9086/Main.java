package basic.string.boj.n9086;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i=0; i<num; i++) {
            String word = br.readLine();
            sb.append(word.charAt(0)).append(word.charAt(word.length()-1)).append("\n");
        }

        System.out.println(sb);
    }
}
