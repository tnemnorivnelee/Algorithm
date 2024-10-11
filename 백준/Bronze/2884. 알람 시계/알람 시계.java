import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M < 45) {
            H--;
            M = 60 + M - 45;
            if (H < 0) {
                H = 23;
            }
            bw.write(String.valueOf(H) + " " + String.valueOf(M));
        } else {
            bw.write(String.valueOf(H) + " " + String.valueOf(M - 45));
        }
        bw.flush();
        br.close();
    }
}
