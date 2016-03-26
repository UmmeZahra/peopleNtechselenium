package API;

import java.util.Random;
//import java.util.Scanner;

public class UseRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rm = new Random();
		int[] array = new int[100];
		//System.out.println("pleas enter a number : ");

		for (int i=0; i<array.length; i++){
			array[i] = rm.nextInt();
		}
		for(int j=0;j<array.length;j++){
			
			System.out.println(array[j]);
		}
	}

}
