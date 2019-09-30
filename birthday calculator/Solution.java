import java.util.Scanner;

public class Solution {
public static void main(String args[] ){

Scanner myscanner = new Scanner(System.in);
int n = myscanner.nextInt();

System.out.println(String.format( "%.3f", (1-birthday(n))));
}

public static double birthday(int n){

double value = (366 - n)/365.00;
int x = n-1;
//fill in the recursive birthday method
if(n==0)
{
return 1;

}
else
return (value*birthday(x));
 
}
}

