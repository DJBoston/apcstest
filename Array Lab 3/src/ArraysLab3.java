import java.util.*;

public class ArraysLab3 {
	public static void main(String[] args) {
		int[] a1 = new int[] {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = new int[] {7, 14, 21, 28, 35, 42, 49, 56};
		
		int[] sumArr = sum(a1,a2);
		int appendNum = 200;
		int[] appendArr = append(a1,appendNum);
		int removeIdx = 5;
		int[] removeArr = remove(a2,removeIdx);
		int sumOfEvens = sumEven(appendArr);
		rotateRight(a1);
		
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
	}
	
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] r = new int[arr1.length];
		for (int i=0;i<arr1.length;i++) {
			r[i] = arr1[i] + arr2[i];
		}
		return r;
	}
	
	public static int[] append(int[] arr, int num) {
		int[] n = new int[arr.length+1];
		for (int i=0;i<arr.length;i++) {
			n[i] = arr[i];
		}
		n[arr.length] = num;
		return n;
	}
	
	public static int[] remove(int[] arr,int idx) {
		int[] n = new int[arr.length-1];
		for(int i=0;i<arr.length;i++) {
			if (i < idx) n[i] = arr[i];
			else if (i > idx) n[i-1] = arr[i];
		}
		return n;
	}
	
	public static int sumEven(int[] arr) {
		int s = 0;
		for (int i=0;i<arr.length;i++) {
			if (i%2==0) s += arr[i];
		}
		return s;
	}
	
	public static void rotateRight(int[] arr) {
		int[] e = arr.clone();
		arr[0] = e[e.length-1];
		for (int i=1;i<arr.length-1;i++) {
			arr[i] = e[i-1];
		}
		arr[arr.length-1] = e[arr.length-2];
	}
}
