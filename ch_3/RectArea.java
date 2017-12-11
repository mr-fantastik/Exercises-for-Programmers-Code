package ch_3;

import java.util.Scanner;

public class RectArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int height, width, areaM;
		double areaF;
		
		System.out.println("Enter a height value:");
		height = sc.nextInt();
		
		System.out.println("Enter a width value:");
		width = sc.nextInt();
		
		areaM = height * width;
		areaF = areaM * .09290304;
		
		System.out.println(areaM);
		System.out.printf("%.2f%n",areaF);

	}

}
