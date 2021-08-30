/*
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/

import java.util.*; // 스캐너 사용을 위해서

class Main{ // Main 클래스
    public static void main(String [] args){ // main 메소드
        Scanner s=new Scanner(System.in); // 스캐너 s 생성
        int N, n;
        N=s.nextInt();
        n=N;
        
        for(int i=N;i>0;i--){
            for(int j=N-i;j>0;j--){
                System.out.print(" ");
            }
            
            for(int k=i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        s.close();
    }
}
