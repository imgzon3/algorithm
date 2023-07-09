package basic.array.onedimension.boj.n10813;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> arr = new ArrayList<>(n);

        for (int l = 0; l < n; l++) {
            arr.add(l+1);
        }

        for (int l = 0; l < m; l++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            Collections.swap(arr, i-1, j-1);
        }

        for (Integer ball : arr) {
            System.out.print(ball + " ");
        }
    }
}
