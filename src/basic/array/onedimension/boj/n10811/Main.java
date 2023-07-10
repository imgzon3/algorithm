package basic.array.onedimension.boj.n10811;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> arr = new ArrayList<>(n);
        for (int l=0; l<n; l++) {
            arr.add(l+1);
        }

        for (int l=0; l<m; l++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            List<Integer> tempArr = new ArrayList<>(j-i+1);
            for (int t=i-1; t<j; t++) {
                tempArr.add(arr.get(t));
            }
            Collections.reverse(tempArr);
            for (int t=i-1; t<j; t++) {
                arr.set(t, tempArr.get(t-i+1));
            }
        }

        for (Integer num : arr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}
