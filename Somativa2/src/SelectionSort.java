public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String a[]){
        int[] arr1 = {3,6,8,1,4,9,0};
        System.out.println("Array antes do Selection Sort:\n");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);

        System.out.println("Array antes do Selection Sort:\n");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
