
public class Lab {

    public int min;
    public int max;
    public int avg;

    public Lab() {
    }

    public Lab(int[] numbers) {
        this.min = AMin(numbers);
        this.max = AMax(numbers);
        this.avg = Aavg(numbers);
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

    public int Aavg(int[] A)
    {
        int sum=0;

        for(int i=0;i<A.length;i++)
        {
            sum+=A[i];
        }
        return max;
    }



}
