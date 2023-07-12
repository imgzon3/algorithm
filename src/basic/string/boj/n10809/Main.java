package basic.string.boj.n10809;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();
        int[] alph = new int[26];

        for (int i=0; i<26; i++) {
            alph[i] = -1;
        }
        for (int i=0; i<word.length(); i++) {
            int tempAlph = word.charAt(i) - 'a';
            if (alph[tempAlph]==-1) {
                alph[word.charAt(i) - 'a'] = i;
            }
        }
        for (int a : alph) {
            sb.append(a).append(" ");
        }

        System.out.println(sb);

    }
}
