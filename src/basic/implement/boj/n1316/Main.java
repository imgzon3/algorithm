package basic.implement.boj.n1316;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = num;

        for (int i=0; i<num; i++) {
            String temp = br.readLine();
            boolean[] alphabets = new boolean[26];
            char prev = temp.charAt(0);
            alphabets[prev-'a'] = true;
            for (int k=0; k<temp.length(); k++) {
                char alph = temp.charAt(k);
                if (alph != prev) {
                    if (!alphabets[alph-'a']) {
                        alphabets[alph-'a'] = true;
                        prev = alph;
                    }
                    else {
                        result--;
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
