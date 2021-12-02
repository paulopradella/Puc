//GIOVANNA TROMBIN
//HELITON FLAVIO DE ALMEIDA
//LUISA GAVLAK VILARES CORDEIRO
//MATHEUS SAMUEL
//PAULO HENRIQUE RODRIGUES PRADELLA

public class SelectionSort {
    public static void selectionSort(int[] s){
        for (int i = 0; i < s.length - 1; i++)
        {
            int base = i;
            for (int j = i + 1; j < s.length; j++){
                if (s[j] < s[base]){
                    base = j;
                }}
            int smallerNumber = s[base];
            s[base] = s[i];
            s[i] = smallerNumber;
        }}

    public static void main(String[] a){
        int[] s1 = {3,6,8,1,4,9,0};
        System.out.println("Array antes do uso do Selection Sort:");
        for(int i:s1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(s1);

        System.out.println("\nArray depois do uso do Selection Sort:");
        for(int i:s1){
            System.out.print(i+" ");
        }}}
