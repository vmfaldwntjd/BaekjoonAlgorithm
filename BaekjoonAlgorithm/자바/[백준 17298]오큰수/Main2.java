import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<Integer>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] result = new int[n + 1];
        String[] s = br.readLine().split(" ");

        for (int i = 1; i <= n; ++i) {
            arr[i] = Integer.parseInt(s[i - 1]);
        }
        stack.push(1);
        for (int i = 2; i <= n; ++i) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                if (arr[stack.peek()] >= arr[i]) {
                    stack.push(i);
                } else {
                    while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                        int tmp = stack.pop();
                        result[tmp] = arr[i];
                    }
                    stack.push(i);
                }
            }
        }
        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            result[tmp] = -1;
        }
        for (int i = 1; i <= n; ++i) {
            bw.write(result[i] + " ");
        }
        bw.flush();
    }
}
