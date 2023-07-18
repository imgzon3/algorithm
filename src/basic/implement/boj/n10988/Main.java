package basic.implement.boj.n10988;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int result = 1;

        for (int i=0; i<word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-i-1)) {
                result = 0;
            }
        }
        System.out.println(result);
    }
}
