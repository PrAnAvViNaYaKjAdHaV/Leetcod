package Arrays;

import java.util.Arrays;

public class colorSort {
    public static void sort012(int a[], int n)
    {
        int lo = 0;
        int hi = n - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
            case 0: {
                temp = a[lo];
                a[lo] = a[mid];
                a[mid] = temp;
                lo++;
                mid++;
                break;
            }
            case 1:
                mid++;
                break;
            case 2: {
                temp = a[mid];
                a[mid] = a[hi];
                a[hi] = temp;
                hi--;
                break;
            }
            }
        }
    }

    public static void main(String[] args) {
        int a[] ={0,2,1,0,2,1,0,2};
    
       colorSort.sort012(a, 8);
       System.out.println(Arrays.toString(a));
    }
    
}
