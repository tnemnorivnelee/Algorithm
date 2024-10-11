
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        String arr[] = new String[T];

        for (int i = 0; i < T; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < T; i++) {
            int count = 0;
            int total = 0;

            for (int j = 0; j < arr[i].length(); j++) {

                if(arr[i].charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                total = total + count;
            }
            sb.append(total).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
