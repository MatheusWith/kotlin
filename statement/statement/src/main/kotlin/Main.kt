package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun sumOf(a: Int, b: Int): Int {
    return  a + b;
}
fun main() {
    val a: Int = 10;
    val b: Int = 5;
    var sum: Int = sumOf(a,b);
    var mult : Int = a * b;
    println(sum);
    println(mult);

    val x: Int = 1000;
    val y: Int = 999;
    val w: Int = 1122;
    var max1: Int = if(x > y) x else y;
    var max2: Int = if(w > x) w else x;
    println("The maximum of ${x} and ${y} is $max1 ");
    println("The maximum of ${w} and ${x} is $max2 ");

    //Declaration of a variable is a statement.
    val marks: Int = 90;
    var grade: Char = 'A';
    //Assigning a value to a variable is also a statement.
    var s: Int = 10 + 20;

    val ss: Int;
    ss = 100;
    // single statement
    println(ss);
    // Multiple statements
    println("Hello"); println("World");


    val array = intArrayOf(2,4,6,8);
    // Start of inner block
    for (element in array) {
        println(element);
    }
    // End of inner block

    val num1: Int = 5+3;
    val num2: Int = 10;
    val bigger: Int = if( num1 > num2 ) num1 else num2;
    if (bigger == num1) {
        println("num1 is bigger");
    } else {
        println("num2 is bigger");
    }
    println("num1 = $num1");
    println("num2 = $num2");
    println("bigger = $bigger");



}