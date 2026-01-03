package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var rollno: Int = 55;
    var name = "Ram";
    println(rollno);
    println(name);

    val a: Int = 1  // Explicit type declaration
    val b = 1       // Type is inferred by the compiler
    println(a);
    println(b);

    // An immutable variable
    val myName = "With";
    // myName = "Ne" compile time error
    var mybirthday = "01/02/2003";
    val myNewBirthDay = mybirthday;
    println(myNewBirthDay);

    // A mytable variable

    var myAge = 21;
    myAge = 22;// compiles successfully
    println("My new Age is ${myAge}")

    /*
    Naming Convention:
        Every variable should be named using lowerCamelCase.
    */

}