
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st1.nextToken());

        for (int i = 0; i < T; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st2.nextToken());
            int B = Integer.parseInt(st2.nextToken());

            bw.write(String.valueOf(A + B));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
