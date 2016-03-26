package String;

import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args){
		// TODO Auto-generated method stub
	int[] array = new int[5];
Scanner sr = new Scanner(System.in);
System.out.println("pleas enter a number : ");

for (int i=0; i<array.length; i++){
	array[i] = sr.nextInt();
}
sr.close();
for(int j=0;j<array.length;j++){
	
	System.out.println(array[j]);
}
//int numb = sr.nextInt();
//System.out.println(numb);
	}

}
