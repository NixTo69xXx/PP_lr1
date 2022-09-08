package LR1;
/**
 * This is Fibonacci class
 */
public class Fibonacci
{
    /**
     * This is int field which contains information on how many Fibonacci numbers are needed
     */
    int N;
    Fibonacci(int N)
    {
        this.N = N;
    }

    /**
     * This method finds the sum of first N Fibonacci numbers
     * and prints the final result
     */
    public void FindingSum()
    {
        if(N==1)
        {
            System.out.print("Sum of first 1 Fibonacci numbers is : 0");
            return;
        }
        int[]Nums=new int[N];
        Nums[0] = 0;Nums[1] = 1;
        int sum = 1;
        for (int i = 2; i < N; i++)
        {
            Nums[i] = Nums[i - 2] + Nums[i - 1];
            sum+=Nums[i];
        }

        System.out.print("Sum of first ");
        System.out.print(N);
        System.out.print(" Fibonacci numbers is : ");
        System.out.print(sum);
    }
}
