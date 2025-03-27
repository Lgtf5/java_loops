package dev.lidia;



public class MultiplicationTable {
    public static String multiplicationTable(int number) {
   
    String result = "";
    for (int i = 1; i <= 10; i++) {
        result += String.format ("%d x %d = %d\n", number, i, number * i);
    }
    return result;
}}

