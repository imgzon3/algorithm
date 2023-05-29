package basic.ifelse.boj.n2525;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int addM = Integer.parseInt(br.readLine());

        if (m+addM < 60) {
            System.out.println(t + " " + (m+addM));
        }
        else if ((t+(m+addM)/60) < 24) {
            System.out.println(t+(m+addM)/60 + " " + (m+addM)%60);
        }
        else {
            System.out.println((t+(m+addM)/60)%24 + " " + (m+addM)%60);
        }
    }
}
