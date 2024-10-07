
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int N = Integer.parseInt(s);

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                bw.write('*');
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
