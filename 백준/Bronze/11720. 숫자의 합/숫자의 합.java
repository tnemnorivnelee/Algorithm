import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String nums = br.readLine();

        int arr[] = new int[N];

        int total = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(String.valueOf(nums.charAt(i)));
            total += arr[i];
        }
        System.out.println(total);
    }
}
