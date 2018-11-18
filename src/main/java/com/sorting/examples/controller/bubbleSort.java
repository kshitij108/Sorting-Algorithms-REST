package com.sorting.examples.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
public class bubbleSort {

    @RequestMapping("/bubblesort")
    public int[] bubbleSort() {
        int[] sortedList = bubble_sort();
        return sortedList;
    }

    public static int[] bubble_sort() {
        int[] array = {99, 88, 55, 77, 1, 66};
        return bubble_sort(array, true);
    }

    public static int[] bubble_sort(int[] input, boolean ascending) {

        int inputLength = input.length;
        int temp;
        boolean is_sorted;

        for (int i = 0; i < inputLength; i++) {

            is_sorted = true;

            for (int j = 1; j < (inputLength - i); j++) {

                if (ascending) {
                    if (input[j - 1] > input[j]) {
                        temp = input[j - 1];
                        input[j - 1] = input[j];
                        input[j] = temp;
                        is_sorted = false;
                    }
                } else {
                    if (input[j - 1] < input[j]) {
                        temp = input[j - 1];
                        input[j - 1] = input[j];
                        input[j] = temp;
                        is_sorted = false;
                    }

                }

            }

            // is sorted? then break it, avoid useless loop.
            if (is_sorted) break;

        }

        return input;
    }

    public static void printArray(int[] data) {
        String result = Arrays.stream(data)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}