package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter size arr:");
        Scanner scanner = new Scanner(System.in);
        int sizearr = scanner.nextInt();
        int[] arr = new int[sizearr];
        System.out.println("Array is:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter a number want find and delete:");
        int number = scanner.nextInt();
        findValue(arr, number);

        System.out.println("New array:");
        delValue(arr, number);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int findValue(int[] array, int index_del) {
        boolean isExist = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index_del) {
                System.out.println("Position of the number in the list " + index_del);
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found " + index_del + " in the list.");
        return index_del;
    }

    public static void delValue(int[] array, int number) {
        int count = 0 ;
        for (int i=0;i<array.length;i++){
            if (number==array[i]){
                int index = i;
                count++;
                while (array[index+1] == number){
                    count++;
                    index++;
                }
                if (count==1){
                    for (int j=i;j<array.length-1;j++){
                        array[j]=array[j+1];
                    }
                    array[array.length-1]=0;
                    count=0;
                    continue;
                }
                for (int j=i;j<array.length-count;j++){
                    array[j]=array[j+count];
                }
                for(int z = count; z > 0; z--){
                    array[array.length-z]=0;
                }
                count=0;
            }
        }
    }
}
