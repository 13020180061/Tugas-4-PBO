/*
	Nama	: St.Hatijah H.Ilyas
	Tanggal	: 28 Maret 2020
	Waktu	: 18.12 WITA
*/


import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Batasan Deret Fibonacci = ");
		int n = input.nextInt();
		
		for(int i=1; i<=n; i++)
			System.out.println(fibo(i) + " ");
		System.out.println();
	}

	static int fibo(int n)
	{
		int f;
		if(n==1 || n==2)
			f=1;
		else
			f = fibo(n-1) + fibo(n-2);
		return f;
	}
}