
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        int min = 1000001;
        int max = -1000001;

        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());

            if( n > max ) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        bw.write(sb.append(min).append(" ").append(max).toString());
        bw.flush();
        bw.close();
    }
}
