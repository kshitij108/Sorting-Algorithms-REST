package com.sorting.examples.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class selectionSort {


    @RequestMapping("/selectionsort")
    public int[] bubbleSort() {
        int[] sortedList = selection_sort();
        return sortedList;
    }

    private static int[] selection_sort() {

        int[] input = {10, 8, 99, 7, 1, 5, 88, 9};

        int inputLength = input.length;

        for (int i = 0; i < inputLength - 1; i++) {

            int min = i;

            // find the first, second, third, fourth... smallest value
            for (int j = i + 1; j < inputLength; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }

            // swaps the smallest value with the position 'i'
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;

            //next pls
        }

        return input;
    }

}
