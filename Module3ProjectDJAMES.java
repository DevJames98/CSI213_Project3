/*
 * Name: Devon James        Date: November 5th, 2017
 * CSI 213                  Prof. George Berg
 * Discussion: Monday 11:30-12:25
 */
package module3projectdjames;

import java.util.Arrays;
import java.util.Random;


public class Module3ProjectDJAMES {
    
    static int comp1,comp2,comp3;           //Comparison counter for different QS Methods
    static int aTotal1=0,aTotal2=0,aTotal3=0;  //random comparison counters
    static int bTotal1=0,bTotal2=0,bTotal3=0;  //pre-sort comparison counters
    static int cTotal1=0,cTotal2=0,cTotal3=0;  //reverse comparison counters
    static double avg1,avg2,avg3;
    
    public static void x() {                                                //Basic QuickSort
        
        System.out.println("BASIC QUICKSORT"); System.out.println("-----------------------------------------------------");
        for(int x =1; x<=10; x++){
            int arr[]= new int [1000];
            
            System.out.print(x+") Starting Array: ");
            for(int i=0; i<arr.length; i++){                                //loop that generates random numbers from 0-99
                Random rand = new Random();
                arr[i] = rand.nextInt(100);
                System.out.print(arr[i] + " ");
        }
            System.out.println(""); System.out.println("-----------------------------------------------------");

            quickSort(arr,0,arr.length-1);                                  //Sorting Random Array
            System.out.print("Sorting Random Array: ");
            for(int i=0; i<arr.length; i++){                                //loop that prints the sorted array
                System.out.print(arr[i] + " ");
            }
            
            System.out.println("");
            System.out.println("    # of Comparisons: " + comp1); System.out.println("");
            aTotal1=aTotal1+comp1; comp1=0;
            
            int sArr[]= Arrays.copyOf(arr,1000);                             //Copies Sorted Array
            quickSort(sArr,0,sArr.length-1);
            System.out.print("Sorting Sorted Array: ");
            for(int i=0; i<sArr.length; i++){                                //loop that prints the sorted array
                System.out.print(sArr[i] + " ");
            }
            System.out.println(""); 
            System.out.println("    # of Comparisons: " + comp1); System.out.println("");
            bTotal1=bTotal1+comp1; comp1=0;
            
            reverseSort(arr);                                                //Reverse Sorting Method
            int rArr[]= Arrays.copyOf(arr, 1000);                            //Copies Reverse Sorted Method
            quickSort(rArr,0,rArr.length-1);
            System.out.print("Sorting Reverse Sorted Array: ");
            for(int i=0; i<rArr.length; i++){                                //loop that prints the sorted array
                System.out.print(rArr[i] + " ");
            }
            System.out.println(""); 
            System.out.println("    # of Comparisons: " + comp1); System.out.println(""); System.out.println("");
            cTotal1=cTotal1+comp1; comp1=0;
        }
}
    
    public static void y(){                                                     //Random Pivot Point QuickSort
        
        System.out.println("RANDOM PIVOT POINT QUICKSORT"); System.out.println("-----------------------------------------------------");
        for(int x =1; x<=10; x++){
            int arr[]= new int [1000];
            
            System.out.print(x+") Starting Array: ");
            for(int i=0; i<arr.length; i++){                                //loop that generates random numbers from 0-99
                Random rand = new Random();
                arr[i] = rand.nextInt(100);
                System.out.print(arr[i] + " ");
        }
            System.out.println(""); System.out.println("-----------------------------------------------------");

            rPivot(arr,0,arr.length-1);                                  //Sorting Random Array
            System.out.print("Sorting Random Array: ");
            for(int i=0; i<arr.length; i++){                                //loop that prints the sorted array
                System.out.print(arr[i] + " ");
            }
            
            System.out.println("");
            System.out.println("    # of Comparisons: " + comp2); System.out.println("");
            aTotal2=aTotal2+comp2; comp2=0;
            
            int sArr[]= Arrays.copyOf(arr,1000);                             //Copies Sorted Array
            rPivot(sArr,0,sArr.length-1);
            System.out.print("Sorting Sorted Array: ");
            for(int i=0; i<sArr.length; i++){                                //loop that prints the sorted array
                System.out.print(sArr[i] + " ");
            }
            System.out.println(""); 
            System.out.println("    # of Comparisons: " + comp2); System.out.println("");
            bTotal2=bTotal2+comp2; comp2=0;
            
            reverseSort(arr);                                                //Reverse Sorting Method
            int rArr[]= Arrays.copyOf(arr, 1000);                            //Copies Reverse Sorted Method
            rPivot(rArr,0,rArr.length-1);
            System.out.print("Sorting Reverse Sorted Array: ");
            for(int i=0; i<rArr.length; i++){                                //loop that prints the sorted array
                System.out.print(rArr[i] + " ");
            }
            System.out.println(""); 
            System.out.println("    # of Comparisons: " + comp2); System.out.println(""); System.out.println("");
            cTotal2=cTotal2+comp2; comp2=0;
            
            
        }
    }
    
    public static void z(){                                                     //Median-of-Three Partitioning QuickSort
        
        System.out.println("MEDIAN-OF-THREE PARTITIONING QUICKSORT"); System.out.println("-----------------------------------------------------");
        for(int x =1; x<=10; x++){
            int arr[]= new int [1000];
            
            System.out.print(x+") Starting Array: ");
            for(int i=0; i<arr.length; i++){                                //loop that generates random numbers from 0-99
                Random rand = new Random();
                arr[i] = rand.nextInt(100);
                System.out.print(arr[i] + " ");
        }
            System.out.println(""); System.out.println("-----------------------------------------------------");

            medThreePart(arr);                                  //Sorting Random Array
            System.out.print("Sorting Random Array: ");
            for(int i=0; i<arr.length; i++){                                //loop that prints the sorted array
                System.out.print(arr[i] + " ");
            }
            
            System.out.println("");
            System.out.println("    # of Comparisons: " + comp3); System.out.println("");
            aTotal3=aTotal3+comp3; comp3=0;
            
            int sArr[]= Arrays.copyOf(arr,1000);                             //Copies Sorted Array
            medThreePart(sArr);
            System.out.print("Sorting Sorted Array: ");
            for(int i=0; i<sArr.length; i++){                                //loop that prints the sorted array
                System.out.print(sArr[i] + " ");
            }
            System.out.println(""); 
            System.out.println("    # of Comparisons: " + comp3); System.out.println("");
            bTotal3=bTotal3+comp3; comp3=0;
            
            reverseSort(arr);                                                //Reverse Sorting Method
            int rArr[]= Arrays.copyOf(arr, 1000);                            //Copies Reverse Sorted Method
            medThreePart(rArr);
            System.out.print("Sorting Reverse Sorted Array: ");
            for(int i=0; i<rArr.length; i++){                                //loop that prints the sorted array
                System.out.print(rArr[i] + " ");
            }
            System.out.println(""); 
            System.out.println("    # of Comparisons: " + comp3); System.out.println(""); System.out.println("");
            cTotal3=cTotal3+comp3; comp3=0;
            
            
        }
    }
    public static void quickSort(int qArr[], int start, int end) {              //quicksort method
	
        int pivot;
        
        if(start < end){
            pivot = partition(qArr,start,end);
             quickSort(qArr, start, pivot - 1);
             quickSort(qArr, pivot + 1, end);
        }
    }
        public static void swap(int qArr[], int start, int end){        //method used to swap elements
            int temp = qArr[end];
            qArr[end] = qArr[start];
            qArr[start]=temp; comp1++;                                //used to track # of comparisons
        }
        
        public static int partition(int qArr[], int start, int end){    //partition method used in quicksort
            int pivot; int endLeft; int mid;
            
             mid = (start + end) / 2;
             swap(qArr, start, mid);
             pivot=qArr[start];
             endLeft=start;
             for (int scan = start + 1; scan <= end; scan++){
                 if(qArr[scan]<pivot){
                     endLeft++;
                     swap(qArr,endLeft,scan);
                 }
             }
             swap(qArr,start,endLeft);
             return endLeft;
        }
    
    public static void rPivot (int qArr[], int start, int end){                 //good for runtime
        
        int pivot;
        
        if(start < end){
             pivot = partition2(qArr,start,end);
             rPivot(qArr, start, pivot - 1);
             rPivot(qArr, pivot + 1, end);
        }
    }
        public static void swap2(int qArr[], int start, int end){        //method used to swap elements
            int temp = qArr[end];
            qArr[end] = qArr[start];
            qArr[start]=temp; comp2++;                                //used to track # of comparisons
        }
        
        public static int partition2(int qArr[], int start, int end){    //partition method used in quicksort
            int pivot; int endLeft; int mid;
            
            Random rand = new Random();
             mid = start + rand.nextInt(end-start+1);
             swap2(qArr, start, mid);
             pivot=qArr[start];
             endLeft=start;
             for (int scan = start + 1; scan <= end; scan++){
                 if(qArr[scan]<pivot){
                     endLeft++;
                     swap2(qArr,endLeft,scan);
                 }
             }
             swap2(qArr,start,endLeft);
             return endLeft;
    }   
        
    public static void medThreePart(int[] intArray) {
        recQuickSort(intArray, 0, intArray.length - 1);
      }

      public static void recQuickSort(int[] intArray, int left, int right) {
        int size = right - left + 1;
        if (size <= 3)
          manualSort(intArray, left, right);
        else {
          double median = medianOf3(intArray, left, right);
          int partition = partitionIt(intArray, left, right, median);
          recQuickSort(intArray, left, partition - 1);
          recQuickSort(intArray, partition + 1, right);
        }
      }

      public static int medianOf3(int[] intArray, int left, int right) {
        int center = (left + right) / 2;

        if (intArray[left] > intArray[center])
          swap(intArray, left, center);

        if (intArray[left] > intArray[right])
          swap(intArray, left, right);

        if (intArray[center] > intArray[right])
          swap(intArray, center, right);

        swap3(intArray, center, right - 1);
        return intArray[right - 1];
      }

      public static void swap3(int[] intArray, int dex1, int dex2) {
        int temp = intArray[dex1];
        intArray[dex1] = intArray[dex2];
        intArray[dex2] = temp;  comp3++;
      }

      public static int partitionIt(int[] intArray, int left, int right, double pivot) {
        int leftPtr = left;
        int rightPtr = right - 1;

        while (true) {
          while (intArray[++leftPtr] < pivot);
          while (intArray[--rightPtr] > pivot);
          if (leftPtr >= rightPtr)
            break;
          else
            swap3(intArray, leftPtr, rightPtr);
        }
        swap3(intArray, leftPtr, right - 1);
        return leftPtr;
      }

      public static void manualSort(int[] intArray, int left, int right) {
        int size = right - left + 1;
        if (size <= 1)
          return;
        if (size == 2) {
          if (intArray[left] > intArray[right])
            swap(intArray, left, right);
          return;} 
        else {
          if (intArray[left] > intArray[right - 1])
            swap(intArray, left, right - 1);
          if (intArray[left] > intArray[right])
            swap(intArray, left, right);
          if (intArray[right - 1] > intArray[right])
            swap(intArray, right - 1, right);
    }
  }


 
 
    public static void bubbleSort(int[] bArray) {                   //bubble sort method (Pre-Sorted)

    int last; int index; int temp; 
    for (last=bArray.length -1;last>=0;last--) {
        for (index=0;index<=last -1;index++) {
               
            if (bArray[index] > bArray[index+1]) {
                temp = bArray[index];
                bArray[index] = bArray[index+1];
                bArray[index+1] = temp;
            }  
        } 
    }
}
   
    public static void reverseSort(int[] rArray){                   //Reverse Sorted List
        
        int j; int i; int temp; 
        for(i=0; i < rArray.length; i++){
            for(j=1; j < (rArray.length-i); j++){
                               
                if(rArray[j-1] < rArray[j]){
                        temp = rArray[j-1];
                        rArray[j-1] = rArray[j];
                        rArray[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
       x(); y(); z();
       
       System.out.println("AVERAGE NUMBER OF COMPARISONS"); System.out.println("-----------------------------------------------------");
       
       System.out.println("Using Basic QuickSort Method:");
        avg1=aTotal1/10;      System.out.println("    Average Number of Comparisons for Random List: "+avg1);          //calculating averages
        avg1=bTotal1/10;      System.out.println("    Average Number of Comparisons for Pre-Sorted List: "+avg1);
        avg1=cTotal1/10;     System.out.println("    Average Number of Comparisons for Reverse Sorted List: "+avg1);
        System.out.println("");
        
        System.out.println("Using Random Pivot Point QuickSort:");
        avg2=aTotal2/10;      System.out.println("    Average Number of Comparisons for Random List: "+avg2);          //calculating averages
        avg2=bTotal2/10;      System.out.println("    Average Number of Comparisons for Pre-Sorted List: "+avg2);
        avg2=cTotal2/10;     System.out.println("    Average Number of Comparisons for Reverse Sorted List: "+avg2);
        System.out.println("");
       
        System.out.println("Using Median-of-Three Partitioning QuickSort:");
        avg3=aTotal3/10;      System.out.println("    Average Number of Comparisons for Random List: "+avg3);          //calculating averages
        avg3=bTotal3/10;      System.out.println("    Average Number of Comparisons for Pre-Sorted List: "+avg3);
        avg3=cTotal3/10;     System.out.println("    Average Number of Comparisons for Reverse Sorted List: "+avg3);
        System.out.println("");
}
   
}
