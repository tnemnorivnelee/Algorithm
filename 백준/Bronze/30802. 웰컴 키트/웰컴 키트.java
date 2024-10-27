import java.io.*;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] arr = new int[6];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        int tShirtsBundle = 0;
        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());

        for (int i = 0; i < arr.length; i++) {
            tShirtsBundle += arr[i] / T;
            if(arr[i] % T != 0) {
                tShirtsBundle++;
            }
        }

//        for(int i = 0; i < arr.length; i++) {
//           if(arr[i] <= T) {
//               tShirtsBundle++;
//           } else {
//               tShirtsBundle += 2;
//           }
//        }

        bw.write(String.valueOf(tShirtsBundle));
        bw.newLine();
        bw.write(String.valueOf(N / P) + " " + String.valueOf(N % P));

        bw.flush();
        bw.close();
    }
}
