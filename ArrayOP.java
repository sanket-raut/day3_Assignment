package Assignments;

public class ArrayOP {
    public static void main(String[] args){
        int arr[];
        arr = new int[]{3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
        System.out.println(arr.length);
        int sum = 0;
        int avg;
        int min=arr[0];

        for(int i=0;i<15;i++)
        {
            sum+=arr[i];
            min = Math.min(min, arr[i]);

        }
        avg = sum/15;
        arr[15] = sum;
        arr[16] = (int)avg;
        arr[17]= min;

        for (int i : arr)
        {
            System.out.print(i+" ");
        }
    }

}
