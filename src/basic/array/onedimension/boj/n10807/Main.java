package basic.array.onedimension.boj.n10807;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>(size);

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<size; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int num = Integer.parseInt(br.readLine());

        System.out.println(Collections.frequency(arr, num));
    }
}
