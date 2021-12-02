//GIOVANNA TROMBIN
//HELITON FLAVIO DE ALMEIDA
//LUISA GAVLAK VILARES CORDEIRO
//MATHEUS SAMUEL
//PAULO HENRIQUE RODRIGUES PRADELLA

public class BubbleSort {
    static void bubbleSort(int[] b) {
        int n = b.length;
        int base;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(b[j-1] > b[j]){
                    base = b[j-1];
                    b[j-1] = b[j];
                    b[j] = base;
                }}}}

    public static void main(String[] args) {
        int[] b ={3,6,8,1,4,9,0};

        System.out.println("Array antes do uso do Bubble Sort:");
        for (int k : b) {
            System.out.print(k + " ");
        }
        System.out.println();

        bubbleSort(b);

        System.out.println("Array depois do uso do Bubble Sort:");
        for (int j : b) {
            System.out.print(j + " ");
        }}}
