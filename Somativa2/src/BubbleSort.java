public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        int[] arr ={3,6,8,1,4,9,0};

        System.out.println("Array antes do Bubble Sort:\n");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array depois Bubble Sort:\n");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

}
