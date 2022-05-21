package com.company;

public class YoungPhysicist {
    int n;
    int[][]A;

    public YoungPhysicist(int n, int[][] a) {
        this.n = n;
        A = a;
    }

    public YoungPhysicist() {
    }

    public String func(int a[][] , int n)
    {


        int sum=0;
        int f=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
                sum+=a[i][j];
            if(sum==0 ) f=1;
            else {
                f=0;
                break;
            }
        }
        if(f==1)return "YES";
        else return "NO";
    }


}
