package basic.array.twodimension.boj.n10798;

import java.io.*;
import java.util.*;

public class Main1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList[] arr = new ArrayList[5];
        StringBuilder sb = new StringBuilder();

        int length = 0;
        for (int i=0; i<5; i++) {
            String word = br.readLine();
            ArrayList<String> tempArr = new ArrayList<>();
            for (int k=0; k<word.length(); k++) {
                tempArr.add(word.substring(k, k+1));
            }

            length = Math.max(word.length(), length);
            arr[i] = tempArr;
        }

        for (int i=0; i<length; i++) {
            for (int k=0; k<5; k++) {
                if (arr[k].size() > i) {
                    sb.append(arr[k].get(i));
                }
            }
        }

        System.out.println(sb);

    }
}
