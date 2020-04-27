package com.bl;

public class PrintArray {
    public static void main(String[] args){
        Integer[] intArray = {2,3,4,5,6};
        Double[] doubleArray = {2.4,3.2,1.4};
        Character[] strArray = {'A','B','C'};
        toPrint(intArray);
        toPrint(doubleArray);
        toPrint(strArray);
    }
    public static < E > void toPrint( E[] input){
        for(E t : input){
            System.out.println(t);
        }
    }
}
