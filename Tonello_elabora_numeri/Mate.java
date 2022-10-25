/***************************
 * Autore: Tonello Samuele
 * Oggetto: elaborazione di vari numeri
 **************************/

public class Mate {
    
    public static double maxNum(double[] arr){      //numero maggiore in un array

        double nMax=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(nMax<arr[i]){
                nMax=arr[i];
            }
        }

        return nMax;
    }

    public static double minNum(double[] arr){      //numero minore in un array

        double nMin = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (nMin>arr[i]) {
                nMin=arr[i];
            }
        }

        return nMin;
    }

    public static double average(double[] arr){    //media di un array

        double av=0;  

            for (int i = 0; i < arr.length; i++) {
                av+=arr[i];
            }

        av=av/arr.length;

        return av;
    }

    private static int partition(double[] arr, int low, int high){

        double pivot = arr[high];
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {

            if (arr[j] <= pivot)
            {
                i++;
 
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        double temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;

    }

    private static void sort(double[] arr, int low, int high){


        if (low < high)
        {
            int pi = partition(arr, low, high);
 
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    public static void sortArray(double[] arr){  //ordina un array utlizzando il quick sort

        int max = arr.length-1;
        int min = 0;

        sort(arr, min, max);

    }

}
