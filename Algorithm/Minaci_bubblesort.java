package kr.or.kosa.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Main {// 버블정렬
    
	
	public static void main(String[] args) {
	 
		
		Scanner sc = new Scanner(System.in);  
		String[] b = sc.nextLine().split(" "); //배열크기,교환횟수 받기 
		int[] arr = new int[Integer.parseInt(b[0])]; //입력한 배열 크기만큼 배열 만들기
		System.out.println(Arrays.toString(b));
		String[] m = sc.nextLine().split(" "); //배열 숫자 입력받기 
	  //ex) "6 4"
	  //  b[0] = "6"
	  //  b[1] = "4"
		for(int i=0; i <arr.length;i++) {
			arr[i]= Integer.parseInt(m[i]); //입력받은 수를 arr배열에 넣기
		}
	
		bubleSort(arr,Integer.parseInt(b[1])); //
	}
	
	
	public static void bubleSort(int[] a,int n) { //배열과 교환횟수 받아오기 
		int k=0; //횟수 세어주기
				
		for(int i=a.length-1;i>0;i--) { // 배열
			if (k > n) { //횟수 오바 되면 에러  
				System.out.println(-1);
				return;
			}else {
				for(int j=0; j<i; j++) {
			 		if(a[j] > a[j+1]) {
			 			k+=1;
						int temp =a[j];
						a[j] =a[j+1];
						a[j+1]=temp; //swap
			 			if(k == n){ //횟수 체크 
			 			  System.out.printf("%d %d \n", a[j] , a[j+1]); //swap한 수 출력
			 			  return;
			 			} 
					}
				}
			}
		}
		System.out.println(-1); // a배열 횟수보다 k많을 경우에도 return  
		return;
	}
}





