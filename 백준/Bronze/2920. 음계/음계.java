
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        String asc = "1 2 3 4 5 6 7 8";
        String des = "8 7 6 5 4 3 2 1";

        if (input.equals(asc)) {
            System.out.println("ascending");
        } else if (input.equals(des)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
