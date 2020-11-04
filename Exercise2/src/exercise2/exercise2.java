package exercise2;
import java.util.*;
public class exercise2 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner (System.in);
		
		ex1();
		ex2();
		ex3();
		ex4();
		ex5();
		ex6();
		ex7();
		ex8();
		ex9();
		ex10();
	}	
	
		
		
	public static void ex1() {
		String str1  = "The lenght of last word";
		System.out.println("Original String"+str1);
		System.out.println("Length of the last word of the above: "+lengthoflastword(str1));
	}
		
	public static int lengthoflastword (String str1) {
		int lengthword = 0;
		String[]words = str1.split(" ");
		if (words.length>0) {
			lengthword = words[words.length-1].length();
		}else {
			lengthword = 0;
			
	    }
		return lengthword;
	}
	
	public static void ex2() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input a positive number: ");
		int num = in.nextInt();
		int result = (num * (num +1 ) / 2) * (1 << (num-1));
		System.out.println("Sum of subsets of n is: "+result);
		
	}
	
	public static void ex3() {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter side1: ");
		int side1 = in.nextInt();
		System.out.print("Enter side2: ");
		int side2 = in.nextInt();
		System.out.print("Enter side3: ");
		int side3 = in.nextInt();
		System.out.println("Is the said sides from a triangle: "+ isValidTriangle(side1, side2, side3));
		}
	public static boolean isValidTriangle(int a, int b, int c) {
		return (a + b > c && b + c > a && c +a > b);
		
	}
	
	public static void ex4() {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a positive integer");
		int num = in.nextInt();
		System.out.println("Is the said number perfect square?"+isPerfectSquare(num));
		}
	public static boolean isPerfectSquare(int num) {
		int x = num % 10;
		if (x ==2 || x == 3 || x == 7 || x == 8) {
		}
		for (int i = 0; i <= num /2 + 1; i++) {
			if ((long)i * i == num) {
				return true;
			}
		}
		return false;
	}
	
	public static void ex5() {
		Scanner in = new Scanner (System.in);
		System.out.print("Input a: ");
		int a = in.nextInt();
		System.out.print("Input b: ");
		int b = in.nextInt();
		System.out.print("Input c:");
		int c = in.nextInt();
		double result = Math.pow(a, b);
		double result1 = result % c;
		System.out.print("a^b % c ="+result1+"\n");
	}
	
	public static void ex6() {
		Scanner in = new Scanner (System.in);
		System.out.println("Input number of months: ");
		int num = in.nextInt();
		double c = 100000;
		for (int i = 0; i < num; i++);
		c += c*0.04;
		if (c % 1000 != 0) {
			c -= c %1000;
			c += 1000;
			System.out.println("\nAmount of debt: ");
			System.out.printf("%.f\n",c);
			}
	}
	
	public static void ex7() {
		boolean[][] array = {{true, false, true},{false, true,false}};
		int rowsLength = array.length;
		int columnsLength = array[0].length;
		for (int i = 0; i< rowsLength; i++) {
			for (int j = 0; j < columnsLength; j++) {
				
			if (array[i][j]) {
				System.out.print(" t ");
			} else {
				System.out.print(" f ");
			}
				
				
			}
			System.out.print("\n");
		}
		
		}
		
		public static void ex8() {
			int num = 2350;
			System.out.printf("Original number: %d\n", num);
			int shiftRightCount = 0;
			do {
				num >>= 1;
			shiftRightCount++;
			}while (num != 0);
			shiftRightCount--;
			System.out.printf("Result: %s\r\n",shiftRightCount);
		}
		
		public static void ex9() {
			Integer arr[] = new Integer[] {1, 4, 17, 7, 25, 3, 1000};
			int k = 3;
			System.out.println("Original Array: ");
			System.out.println(Arrays.toString(arr));
			System.out.println(k+"largest elements of the said array are: ");
			Arrays.sort(arr);
			for (int i = 0; i< k; i++);
			int i = 0;
			System.out.print(arr[i] +" ");
		}
		public static void ex10() {
			Integer arr[] = new Integer [] {1, 4, 3, 17, 28, 886, 10000};
			int k = 2;
			System.out.println("Original Array: ");
			System.out.println(Arrays.toString(arr));
			System.out.println("K'th smallest element of the said array: ");
			Arrays.sort(arr);
			System.out.print(arr[k-1] + " ");
			System.out.println("nK'th largest element of the said array: ");
			Arrays.sort(arr,Collections.reverseOrder());
			System.out.print(arr[k-1] + " ");
			
		}
	}
	
	
















	
		
	



