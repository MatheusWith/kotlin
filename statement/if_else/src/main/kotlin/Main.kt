package org.example
import java.util.Scanner


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var a: Int = 3;
    if (a > 0) {
        println("Yes, number is positive");
    }


    var n1: Int = 5;
    var n2: Int = 10;
    if ( n1 > n2) {
        println("Number  5 is larger than  10");
    } else {
        println("Number 10 is larger than 5");
    }
    var letterA: Int = 50;
    var letterB: Int = 40;

    // here if-else returns a value which
    // is to be stored in max variable
    var max: Int = if (letterA > letterB) {
        println("Greater number is ");
        letterA;
    } else {
        println("Greater number is");
        letterB;
    }
    println(max);

    // create an object for scanner class
    val reader = Scanner(System.`in`);
    println("Enter any number");

    // read the next Integer value
    var num = reader.nextInt();
    var result = if ( num > 0) {
        "$num is positive  number"
    } else if (num < 0 ) {
        "$num  is negative  number"
    } else {
        "$num is equal to zero"
    }
    println(result);

    val reader1 = Scanner(System.`in`)
    print("Enter three numbers: ")

    var x1 = reader.nextInt()
    var x2 = reader.nextInt()
    var x3 = reader.nextInt()

    var maxx  = if ( x1> x2) {
        if (x1 > x3) {
            "$x1 is the largest number"
        }
        else {
            "$x3 is the largest number"
        }
    }
    else if( x2 > x3 ){
        "$x2 is the largest number"
    }
    else{
        "$x3 is the largest number"
    }
    println(maxx);

}