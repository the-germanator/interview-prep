class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0};
        for(int elem : arr) {
            System.out.print(elem + ", ");
        }
        sort(arr);
        System.out.println();
        for(int elem : arr) {
            System.out.print(elem + ", ");
        }
    }
    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}