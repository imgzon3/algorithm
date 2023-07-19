package basic.implement.boj.n1157;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];

        char[] words = br.readLine().toUpperCase().toCharArray();
        for (char word : words) {
            alpha[word-'A']++;
        }

        int result = 0;
        int frequency = 0;
        for (int i=0; i<26; i++) {
            if (alpha[i] > frequency) {
                frequency = alpha[i];
                result = i;
            }
            else if (alpha[i] == frequency) {
                result = -1;
            }
        }

        if (result == -1) {
            System.out.println("?");
        }
        else {
            System.out.println((char) ('A'+result));
        }

    }
}
