package javaDersleri;

import java.util.Scanner;

public class Siralama {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan =new Scanner(System.in);
		System.out.print("Sayıları giriniz");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		if (a>b&&a>c) {
			
			if (b>c) {
				System.out.println(a+">"+b+">"+c);
				
			}else {
				System.out.println(a+">"+c+">"+b);
				
			}
			
		}else if(b>a && b>c) {
			if (a>c) {
				System.out.println(b+">"+a+">"+c);
				
			}else {
				System.out.print(b+">"+c+">"+a);
			}
			
		}else if(c>a&&c>b) {
			if (a>b) {
				System.out.print(c+">"+a+">"+b);
				
			}else {
				System.out.println(c+">"+b+">"+a);
			}
		}else if (a==b&&a==c) {
			System.out.print(a+"="+b+"="+c);
			
		}
		

	}

}
