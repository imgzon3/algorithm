package basic.math.boj.n11005;

import java.io.*;
import java.util.*;

//풀었던 두 번째 방법
//낮은 자리 수부터 나누어감
//더 좋은 알고리즘이라고 생각함
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int jinBub = Integer.parseInt(st.nextToken());

        List<Character> result = new ArrayList<>();

        while (num > 0) {
            if (num % jinBub < 10) {
                result.add((char) (num % jinBub + '0'));
            }
            else {
                result.add((char) (num % jinBub - 10 + 'A'));
            }
            num /= jinBub;
        }

        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(result.size()-i-1));
        }
        System.out.println(sb);
    }
}
