package basic.implement.boj.n2941;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int result = 0;

        for (int i=0; i<word.length(); i++) {
            char temp = word.charAt(i);

            if (i<word.length()-1) {
                if (temp == 'c') {
                    //c=
                    if (word.charAt(i+1) == '=') {
                        i++;
                    }
                    //c-
                    else if (word.charAt(i+1) == '-') {
                        i++;
                    }
                }
                else if (temp == 'd') {
                    //d-
                    if (word.charAt(i+1) == '-') {
                        i++;
                    }
                    //dz=
                    else if (i<word.length()-2) {
                        if (word.charAt(i+1) == 'z' && word.charAt(i+2) == '=') {
                            i+=2;
                        }
                    }
                }
                else if (temp == 'l') {
                    //lj
                    if (word.charAt(i+1) == 'j') {
                        i++;
                    }
                }
                else if (temp == 'n') {
                    //nj
                    if (word.charAt(i+1) == 'j') {
                        i++;
                    }
                }
                else if (temp == 's') {
                    //s=
                    if (word.charAt(i+1) == '=') {
                        i++;
                    }
                }
                else if (temp == 'z') {
                    //z=
                    if (word.charAt(i+1) == '=') {
                        i++;
                    }
                }

            }

            result++;
        }

        System.out.println(result);
    }
}
