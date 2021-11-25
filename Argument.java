package Assignments;

public class Argument
{
    public static void main(String[] args)
    {
        for(int i=0; i<args.length; i++)
        {
            System.out.println(args[i]+ "\t");
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int nextterm;
        System.out.println();
        System.out.println("next term are:");

        for (int i=2; i<15; i++)
        {
            nextterm = a+b;
            System.out.println(nextterm+"\t");
            a = b;
            b = nextterm;
        }
    }
}
