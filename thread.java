import java.util.*;

class mtables extends Thread
{
    int n;

    mtables(int n)
    {
        this.n = n;
    }

    public void run()
    {
        for(int i = 0; i <= n; i++)
        {
            System.out.println("5x" + i + "=" + (5 * i));
        }
    }
}

class prime extends Thread
{
    int n;

    prime(int n)
    {
        this.n = n;
    }

    public void run()
    {
        System.out.println("Prime numbers are:");

        for(int i = 2; i <= n; i++)
        {
            int count = 0;

            for(int j = 1; j <= i; j++)
            {
                if(i % j == 0)
                    count++;
            }

            if(count == 2)
                System.out.println(i);
        }
    }
}

class thread
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int muln, primen;

        System.out.println("Enter n:");
        muln = sc.nextInt();
        mtables t1 = new mtables(muln);

        System.out.println("Enter n:");
        primen = sc.nextInt();
        prime t2 = new prime(primen);

        t1.start();
        t2.start();
    }
}
