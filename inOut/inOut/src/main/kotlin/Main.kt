package org.example
import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun sum(x: Int,y: Int) : Int {
    return x + y;
}

fun main() {
    print("Hello! ");
    println("This is Kotlin tutorial.");
    print("By GFG!");

    println("GeeksforGeeks");
    println("A Computer Science portal for Geeks");

    print("GeeksforGeeks - ");
    print("A Computer Science portal for Geeks");

    var a: Int = 10;
    var b: Int = 20;
    var c: Long = 30L;
    var marks = 40.4;
    println("Sum of {$a} and {$b} is ${sum(a,b)}");
    println("Long  value is: $c");
    println("Marks");
    println("$marks");

    print("Enter text: ")
    var input = readLine()
    print("You entered: $input")

    // create an object for scanner class
    val number1 = Scanner(System.`in`);
    print("Enter an integer: ");
    // nextInt() method is used to take
    // next integer value and store in enteredNumber1 variable
    var enteredNumber1:Int = number1.nextInt();
    println("You entered: $enteredNumber1");

    val number2 = Scanner(System.`in`);
    print("Enter a float value: ");

    // nextFloat() method is used to take next
    // Float value and store in enteredNumber2 variable
    var enteredNumber2:Float = number2.nextFloat();
    println("You entered: $enteredNumber2");

    val booleanValue = Scanner(System.`in`);
    print("Enter a boolean: ");
    // nextBoolean() method is used to take
    // next boolean value and store in enteredBoolean variable
    var enteredBoolean:Boolean = booleanValue.nextBoolean();
    println("You entered: $enteredBoolean");

    //whitout scanner class

    print("Enter an Integer value: ");
    val string1 = readLine()!!;

    // .toInt() function converts the string into Integer
    var integerValue: Int = string1.toInt();
    println("You entered: $integerValue");

    print("Enter a double value: ");
    val string2= readLine()!!;

    // .toDouble() function converts the string into Double
    var doubleValue: Double = string2.toDouble();
    println("You entered: $doubleValue");
}