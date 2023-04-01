import java.util.Scanner;
public class Kimjin_bubble_sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=0;
        int k=0;
        
        n=sc.nextInt();
        k=sc.nextInt();
        int[] number = new int[n];
        //배열입력
        for(int i=0; i<number.length; i++){
            number[i]=sc.nextInt();
        }
        sc.close();
        int min=0;
        int count=0;
        for(int i=0; i<number.length; i++){
            for(int j=0; j<number.length-1; j++){
                if(number[j]>number[j+1]){
                    min=number[j+1];
                    number[j+1]=number[j];
                    number[j]=min;
                    count++;
                }
                if(k==count){
                    System.out.printf("%d %d", number[j], number[j+1]);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}