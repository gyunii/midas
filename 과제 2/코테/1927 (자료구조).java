import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException   {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int in;
        
        PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++) {
            in = Integer.parseInt(br.readLine());
            if (in > 0) {
                minQueue.add(in);
            } else {
                if (!minQueue.isEmpty()) {
                    System.out.println(minQueue.poll()); // poll():우선순위 가장 높은 원소를 반환함과 동시에 삭제(자동으로 다음으로 높은 원소 차례로 넘어감)
                }
                else{
                    System.out.println(0);
                }
            }
        }
        br.close();
    }
}