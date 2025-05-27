/**
 * 
 * Question : Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, .

Constraints

Output Format

Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.
 * 
 *  Link: https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
 * 
 * Answer
 */
import java.util.Scanner;
public class Solution1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
       for(int i=1;i<=10;i++)
       {
         System.out.println(N + " x " + i + " = " + (N * i));
       }

    }
}