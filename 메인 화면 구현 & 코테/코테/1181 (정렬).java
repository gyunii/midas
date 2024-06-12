/*22220218 권정균*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String[] arr = new String[n];

        s.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i]=s.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }

                else {
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(arr[0]);

        for(int j=1; j<arr.length; j++) {
            if(!arr[j].equals(arr[j-1])) {
                System.out.println(arr[j]);
            }
        }


    }
}
