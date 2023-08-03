package basic.implement.boj.n25206;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double time = 0.0;
        double gradeAll = 0.0;

        for (int i=0; i<20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String alph = st.nextToken();

            if (!alph.equals("P")) {
                time += grade;
                switch (alph) {
                    case "A+":
                        gradeAll += 0.5*grade;
                    case "A0":
                        gradeAll += 0.5*grade;
                    case "B+":
                        gradeAll += 0.5*grade;
                    case "B0":
                        gradeAll += 0.5*grade;
                    case "C+":
                        gradeAll += 0.5*grade;
                    case "C0":
                        gradeAll += 0.5*grade;
                    case "D+":
                        gradeAll += 0.5*grade;
                    case "D0":
                        gradeAll += grade;
                    case "F":
                }
            }
        }
        System.out.println(gradeAll/time);
    }
}
