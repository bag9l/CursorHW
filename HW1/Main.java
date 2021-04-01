package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    /////////////////////////////////////////////////////////
        // Сортування масиву:
        System.out.println("1. Сортування масиву:");
        int arr[]={2,3,1,7,11};
        int k;
        System.out.printf("\tПочатковий масив: ");
        for (int i = 0; i < arr.length; i++)
            System.out.printf(arr[i]+" ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j] && i!=j) {
                    k = arr[j];
                    arr[j] = arr[i];
                    arr[i] = k;
                }
            }
        }
        System.out.printf("\tВідсортований масив: ");
        for (int i = 0; i < arr.length; i++)
            System.out.printf(arr[i]+" ");
        System.out.println("\n");
    /////////////////////////////////////////////////////////
        // Сума додатніх елементів масиву:
        System.out.println("2. Сума додатніх елементів масиву:");
        Scanner in = new Scanner(System.in);
        System.out.printf("Введіть розмірність масиву: ");
        int n1 = in.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n1; i++) {
            System.out.print("Array["+i+"] = ");
            arr1[i]=in.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>0)
                sum+=arr1[i];
        }
        System.out.println("Сума: "+sum);
        System.out.println();
    /////////////////////////////////////////////////////////
        // Середній елемент:
        System.out.println("3. Середній елемент:");
       int arr2[]={2,5,3,-2,66,0,-23,5,43};
       int avg=arr2.length/2;
        for (int i = 0; i < arr2.length; i++)
            System.out.printf(arr2[i]+" ");
        System.out.println();
        System.out.println("Середній елемент: "+arr2[avg]);
        System.out.println();
    /////////////////////////////////////////////////////////
        // Заміна дубльованого елемента на нуль:
        System.out.println("4. Заміна дубльованого елемента на нуль:");
        int arr3[]={2,-1,45,2,12,12,11,-1};
        for (int i = 0; i < arr3.length; i++)
            System.out.printf(arr3[i]+" ");

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if(arr3[i]==arr3[j] && i!=j)
                    arr3[j]=0;
            }
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++)
            System.out.printf(arr3[i]+" ");
        System.out.println("\n");
    }
}
