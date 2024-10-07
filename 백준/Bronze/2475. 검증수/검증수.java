
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 문자열 분리

//        int N = Integer.parseInt(st.nextToken());
//        int sum = 0;
//
//        while(st.hasMoreTokens()) {
//            sum += Math.pow(N, 2);
//        }

//        int N = Integer.parseInt(st.nextToken());
        int sum = 0;

        while(st.hasMoreTokens()) {
            sum += Math.pow(Integer.parseInt(st.nextToken()), 2);
        }

//        bw.write(sum % 10);
        System.out.println(sum%10);

        br.close();
        bw.flush();
        bw.close();
    }
}
