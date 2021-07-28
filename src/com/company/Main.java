package com.company;

class Main {
    static int minCount(int arr[], int N){
        int min = 0;
        int max = 0;
        int countFountain = 0;
        while(max<N-1){
            for(int i=0; i<N; i++){
                int from = Math.max(i-arr[i],0);
                int to = Math.min(i+arr[i],N-1);
                if(from<=min && to>=max){
                    max = to;
                }
            }
            if(max==min)return 0;
            countFountain++;
            min = max;
        }
        return countFountain;
    }
    public static void main(String[] args)
    {
        int a[] = {2, 1, 1, 2, 1};
        int N = a.length;
        System.out.print(minCount(a, N));
    }
}
