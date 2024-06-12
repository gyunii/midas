import java.util.*;
 
public class Main {
 
    static int n, del;
    static int[] parent;
    static int count;
    static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        parent = new int[n];
        int root = 0;
        for(int i = 0; i < n; i++) {
            parent[i] = sc.nextInt();        
            if(parent[i] == -1) root = i;
        }
        del = sc.nextInt();
        
        deleteNode(del);
            
        count = 0;
        visited = new boolean[n];
        countLeaf(root);
            
        System.out.println(count);
    }
    
    public static void deleteNode(int d) {
        parent[d] = -2; //삭제 노드 -2로 두기
        for(int i = 0; i < n; i++) {
            if(parent[i] == d) {
                deleteNode(i);
            }
        }
    }
    
    public static void countLeaf(int r) {
        boolean isLeaf = true;
        visited[r] = true;
        if(parent[r] != -2) {
            for(int i = 0; i < n; i++) {
                if(parent[i] == r && visited[i] == false) {
                    countLeaf(i); // 재귀 활용
                    isLeaf = false;
                }
            }
            if(isLeaf) count++;
        }
    }
}