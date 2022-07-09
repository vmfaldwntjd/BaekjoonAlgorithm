import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        bw.write((a + b) % c + "\n");
        bw.write(((a % c) + (b % c)) % c + "\n");
        bw.write((a * b) % c + "\n");
        bw.write(((a % c) * (b % c)) % c + "\n");
        bw.flush();
    }
}
