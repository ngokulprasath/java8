package com.basic.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamBasic {

    public static void main(String[] args) {
        
       System.out.println("starting streams\n Streams can be used to process the collections in a functional approach using lambda expressions");
       
       List<Integer>  numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);

       System.out.println("Intermediate operation : Filter \n It is used to alter the collection in some way. FilterSize<=OriginalListSize");

       System.out.println(" To count the odd numbers of elements in the collection. count is the terminal operator "+numbers.stream().filter(i->i%2!=0).count());

       System.out.println("Intermediate operation : Map \n It is used to perform some action on the collection. OutputSize==OriginalListSize");

       System.out.println(" To double the numbers in the collection. ");
      
       numbers.stream().map(i->i*2).forEach(System.out::println);

       System.out.println("To count the number of elements in the collection ");

       System.out.println("The number of elements in the collection is "+ numbers.stream().count());
       

    }
    
}
