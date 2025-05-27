/**
 * 
 * DSA Question2 Link:
 * 
 * 
 * Answer:
 */
import java.util.*;
public class Dsa1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i< a;i++)
        {
            list.add(sc.nextInt());
        }
        
        int sum=0;
        for(int num : list)
        {
            sum+=num;
        }
        
        System.out.println(sum);
    }
}