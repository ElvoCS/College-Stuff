import java.util.Scanner;

public class Solution {
 public static void main(String args[] ) {
       
     Scanner scan=new Scanner(System.in);
        System.out.println("Enter nth prime number you want to calculate");
        int nthNo=scan.nextInt();  
        scan.close();
     
     int num, counter,i;
     num=1;
     counter=0;
     
     
     while (counter<nthNo){
         num=num+1;
     for (i=2;i<=num;i++){
         if(num%i==0){
             break;
         }
         
     }
   
	if (i==num){
         counter=counter+1;
     	}
     }
     System.out.println("Value of nthNo="+num);
 }
}