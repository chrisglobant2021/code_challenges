package com.company;

public class SumZero {

    //Given an array nums of n integers, are there elements a, b, c in nums such that
    //a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
    // Prints all triplets in arr[] with 0 sum
    static void findTriplets(int[] arr, int n)
    {
        boolean found = false;
        for (int i=0; i<n-2; i++)
        {
            for (int j=i+1; j<n-1; j++)
            {
                for (int k=j+1; k<n; k++)
                {
                    if (arr[i]+arr[j]+arr[k] == 0)
                    {
                        System.out.print(arr[i]);
                        System.out.print(" ");
                        System.out.print(arr[j]);
                        System.out.print(" ");
                        System.out.print(arr[k]);
                        System.out.print("\n");
                        found = true;
                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");

    }

    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        int n =arr.length;
        findTriplets(arr, n);
    }



}
