
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String s = br.readLine(); // baekjoon

        br.close();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }

        for(int val : arr) {
            bw.write(String.valueOf(val) + " ");
        }

        bw.flush();
        bw.close();
    }
}
