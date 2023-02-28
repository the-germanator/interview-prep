import java.util.*;
class Main{
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,6};
        for(int elem : arr) {
            System.out.print(elem);
        }
        mergeSort(arr, 0, arr.length-1);
        System.out.println("\n-----");
        for(int elem : arr) {
            System.out.print(elem);
        }
    }
    public static int[] mergeSort(int[] arr, int start, int end) {
        if((end - start + 1) <= 1) {
            return arr;
        } 
        int mp = (start + end) / 2;
        mergeSort(arr, start, mp);
        mergeSort(arr, mp+1, end);

        merge(arr, start, mp, end);

        return arr;
        
    }
    public static void merge(int[] arr, int start, int middle, int end) {

        int[] leftArr = new int[middle - start + 1];
        int[] rightArr = new int[end - middle];

        // for(int i = 0; i < (middle - start + 1); i++) {
        //     leftArr[i] = arr[start + i];
        // }
        // for(int j = 0; j < (end - middle); j++) {
        //     rightArr[j] = arr[j+middle+1];
        // }


        // for(int i = start; i < middle; i++) {
        //     leftArr[i] = arr[i];
        // }
        for(int j = middle; j < end; j++) {
            rightArr[j] = arr[j+1];
        }


        int insertPtr = start;
        int leftPtr = 0;
        int rightPtr = 0;

        while(leftPtr < leftArr.length && rightPtr < rightArr.length) {
            if(leftArr[leftPtr] <= rightArr[rightPtr]) {
                arr[insertPtr] = leftArr[leftPtr];
                leftPtr++;
            } else {
                arr[insertPtr] = rightArr[rightPtr];
                rightPtr++;
            }
            insertPtr++;
        }
        while(leftPtr < leftArr.length) {
            arr[insertPtr] = leftArr[leftPtr];
            leftPtr++;
            insertPtr++;
        }
         while(rightPtr < rightArr.length) {
            arr[insertPtr] = rightArr[rightPtr];
            rightPtr++;
            insertPtr++;
        }
    }
}
