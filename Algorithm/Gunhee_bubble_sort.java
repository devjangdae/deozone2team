import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int index=0;
        //길이
        int n=sc.nextInt();
        //비교번수
        int k=sc.nextInt();
        //비교군
        int[] A = new int[n];

        //배열 입력
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }


        for(int i=0; i<=n-2; i++){
            for(int j=0; j<=n-2-i; j++){
                if(A[j+1]<A[j]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    index++;
                    for(int x=0; x<n; x++){
                        System.out.printf("%d ",A[x]);
                    }
                    System.out.println();
                }
                if(index==k){
                    System.out.printf("%d %d",A[j],A[j+1]);
                    return;
                }
            }

        }

        if(index<k){
            System.out.println("-1");
        }
    }
}