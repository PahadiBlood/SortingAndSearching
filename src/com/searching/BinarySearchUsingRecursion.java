/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searching;

import java.util.Arrays;

/**
 *
 * @author Manoj
 */
public class BinarySearchUsingRecursion {

    private final int tempArray[];
    private int lastIndex;
    private final int searchNumber;
    private int result;

    public BinarySearchUsingRecursion(int a[], int searchNumber) {
        int b = a.length - 1;
        tempArray = a;
        lastIndex = b;
        this.searchNumber = searchNumber;
    }

    public int binarySearch(int firstIndex, int lastIndex) {

        int mid = (firstIndex + lastIndex) / 2;

        if (searchNumber == tempArray[mid]) {
            result = mid;
        } else if (searchNumber < tempArray[mid]) {

            binarySearch(firstIndex, mid - 1);

        } else if (searchNumber > tempArray[mid]) {
            binarySearch(mid + 1, lastIndex);
        }

        return result;
    }

    public static void main(String[] args) {

        int givenArray[] = {5, 1, 15, 20, 22, 24, 25, 29, 30, 33, 32, 35, 65, 78, 98, 89, 61, 43, 90, 92, 91, 95, 94, 11, 13};
        Arrays.sort(givenArray);
        int searchingNumber=95;
        BinarySearchUsingRecursion m = new BinarySearchUsingRecursion(givenArray, searchingNumber);

        int x = m.binarySearch(0, m.lastIndex); //0 is the first index number of given array

        System.out.println("Answer " + x);

    }

}
