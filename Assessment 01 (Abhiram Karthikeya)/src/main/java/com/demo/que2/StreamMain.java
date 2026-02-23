package com.demo.que2;

import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        //list of own
        List<Integer> nums= Arrays.asList(12,5,7,20,33,42,28,9,2,10,50,15,27,4,11,40,50);

        //Lambda exp for printing even nums
        nums.stream().filter(x->x%2==0).forEach(System.out::println);
        System.out.println("--------------------------------");

        //Lambda Exp for sum of nums
        int sum;
        sum=nums.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum of nums:"+sum);
        System.out.println("--------------------------------");


        //lambda Exp for desc order
        nums.stream().sorted((a,b)->b-a).forEach(System.out::println);
    }
}
