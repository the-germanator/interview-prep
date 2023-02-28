class BubbleSort {
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
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for(int i = 0; i < arr.length - 1; i++) {
                for(int j = i+1; j < arr.length; j++) {
                    if(arr[j] < arr[i]) {
                        sorted = false;
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

    }
}