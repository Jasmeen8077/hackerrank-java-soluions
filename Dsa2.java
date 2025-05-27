/*
 * 
 * Question Link: https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
 * 
 * Answer
 */
import java.util.*;

public class Dsa2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for Alice's triplet
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list1.add(sc.nextInt());
        }

        // Input for Bob's triplet
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list2.add(sc.nextInt());
        }

        int alicePoints = 0;
        int bobPoints = 0;

        // Comparison loop for 3 elements
        for (int i = 0; i < 3; i++) {
            if (list1.get(i) > list2.get(i)) {
                alicePoints++;
            } else if (list1.get(i) < list2.get(i)) {
                bobPoints++;
            }
        }

        // Print results
        System.out.println(alicePoints + " " + bobPoints);
    }
}
