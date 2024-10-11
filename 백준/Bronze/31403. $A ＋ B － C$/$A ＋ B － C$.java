import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        int AB = Integer.parseInt(A) + Integer.parseInt(B);


        bw.write(String.valueOf(AB - Integer.parseInt(C)));
        bw.newLine();
        bw.write(String.valueOf(Integer.parseInt(A + B) - Integer.parseInt(C)));
        bw.flush();
        br.close();
    }
}
