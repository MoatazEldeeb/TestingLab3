package com.company;

public class Lab2 {


    public String checkEvenOrOdd(int n){
        String res;
        if(n%2 ==0) res = "Even";
        else res = "Odd";
        return res;
    }

    public int AMin(int[] A)
    {
        int min=A[0];

        for(int i=1;i<A.length;i++)
        {
            if(A[i]<min) min=A[i];
        }
        return min;
    }
    public int AMax(int[] A)
    {
        int max=A[0];

        for(int i=1;i<A.length;i++)
        {
            if(A[i]>max) max=A[i];
        }
        return max;
    }


}
