package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var myint = 35;
    // add suffix L for long integer
    var mylong = 23L;
    println("My integer ${myint}");
    println("My long integer ${mylong}");

    var b1:Byte = Byte.MIN_VALUE;
    var b2:Byte = Byte.MAX_VALUE;
    println("Smallest byte value: " + b1);
    println("Largest byte value: " + b2);

    var s1: Short = Short.MIN_VALUE;
    var s2: Short = Short.MAX_VALUE;
    println("Smallest short value: " + s1);
    println("Largest short value: " + s2);

    var i1: Int = Int.MIN_VALUE;
    var i2: Int = Int.MAX_VALUE;
    print("Smallest integer value: " + i1);
    println("Largest integer value: " + i2);

    var l1: Long = Long.MIN_VALUE;
    var l2: Long = Long.MAX_VALUE;
    print("Smallest long value: " + l1);
    println("Largest long value: " + l2);

//    var myfloat = 54F;
//    println("My float value ${}");
}