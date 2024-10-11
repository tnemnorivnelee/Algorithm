
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        int word = 0;

        while(st.hasMoreTokens()) {
            st.nextToken();
            word++;
        }
        bw.write(String.valueOf(word));
        bw.flush();
        bw.close();
    }
}
