import java.io.*;
import java.util.*;
class guvi28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            System.out.println(a[i]+" "+i);
        }
    }
}


