package basic.math.boj.n9506;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) {
                break;
            }

            ArrayList<Integer> yaks = new ArrayList<>();

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    yaks.add(i);
                }
            }

            int result = 0;
            for (Integer yak : yaks) {
                result += yak;
            }

            if (num == result) {
                sb.append(num).append(" = ");
                for (int i = 0; i < yaks.size(); i++) {
                    sb.append(yaks.get(i));
                    if (i != yaks.size()-1) {
                        sb.append(" + ");
                    }
                }
                sb.append("\n");
            }
            else {
                sb.append(num).append(" is NOT perfect.\n");
            }

        }

        System.out.println(sb);
    }
}
