
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(Integer.parseInt(br.readLine()) % 42);
        }

        ArrayList<Integer> arr2 = new ArrayList<>();

        for (Integer data : arr) {
            if(!arr2.contains(data)) {
                arr2.add(data);
            }
        }

        br.close();

        bw.write(String.valueOf(arr2.size()));
        bw.flush();
        bw.close();
    }
}
