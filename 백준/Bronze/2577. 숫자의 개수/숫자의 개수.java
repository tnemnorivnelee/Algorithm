
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int numTotal = 0;

        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(br.readLine());
            if (numTotal > 0) {
                numTotal = numTotal * num;
            } else {
                numTotal = num;
            }
        }

        String strTotal = String.valueOf(numTotal);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(0);
        }

        for (int i = 0; i < strTotal.length(); i++) {
            switch (strTotal.charAt(i)) {
                case '0':
                    list.set(0, list.get(0) + 1);
                    break;
                case '1':
                    list.set(1, list.get(1) + 1);
                    break;
                case '2':
                    list.set(2, list.get(2) + 1);
                    break;
                case '3':
                    list.set(3, list.get(3) + 1);
                    break;
                case '4':
                    list.set(4, list.get(4) + 1);
                    break;
                case '5':
                    list.set(5, list.get(5) + 1);
                    break;
                case '6':
                    list.set(6, list.get(6) + 1);
                    break;
                case '7':
                    list.set(7, list.get(7) + 1);
                    break;
                case '8':
                    list.set(8, list.get(8) + 1);
                    break;
                case '9':
                    list.set(9, list.get(9) + 1);
                    break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            bw.write(String.valueOf(list.get(i)) + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
