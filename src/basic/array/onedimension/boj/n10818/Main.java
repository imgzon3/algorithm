package basic.array.onedimension.boj.n10818;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> nums = new ArrayList<>(n);
        for (int i=0; i<n; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        sb.append(Collections.min(nums)).append(" ").append(Collections.max(nums));
        System.out.println(sb);
    }
}
