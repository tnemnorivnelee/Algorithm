
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st2;

        String str;

       while ((str = br.readLine()) != null) {
           st2 = new StringTokenizer(str);
           int A = Integer.parseInt(st2.nextToken());
           int B = Integer.parseInt(st2.nextToken());
           sb.append(A+B).append("\n");
       }
       bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
