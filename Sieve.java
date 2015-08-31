import java.util.Scanner;

public class Sieve {
	public static void main(String[] args){

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the prime number ceiling: ");
		n = sc.nextInt();
		sc.close();

		boolean[] prime = new boolean[n + 1];
		int i;
		for (i = 2; i <= n; i++){
			prime[i] = true;
		}
		for (int divisor = 2; divisor*divisor <= n; divisor++){
			if(prime[divisor]){
				for(i = 2*divisor; i <= n; i = i+divisor){
					prime[i] = false;
				}
			}
		}
		for (i = 2; i <= n; i++){
			if (prime[i]){
				System.out.print(" " + i);
			}
		}
	}
}