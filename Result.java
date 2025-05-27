/*
 * Question: DSA question 1
 * Link : https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
 * 
 * 
 * 


Answer
 */
import java.util.*;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();            
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());      
        }

        Collections.reverse(list);      

        for (int num : list) {
            System.out.print(num + " "); 
        }

        sc.close();
    }
}
