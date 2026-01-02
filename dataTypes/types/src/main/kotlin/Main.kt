package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // int
    var myint = 35;
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

    //float
    var myfloat = 54F;
    println("My float value ${myfloat}");

    var f1: Float = Float.MIN_VALUE;
    var f2: Float = Float.MAX_VALUE;
    println("Smallest Float value " + f1);
    println("Largest Float value " + f2);

    // doble
    var d1: Double = Double.MIN_VALUE;
    var d2: Double = Double.MAX_VALUE;
    println("Smallest Double value " + d1);
    println("Largest Double value " + d2);

    //Bolean
    if  (true is Boolean) {
        println("Yes, true is bolean value");
    };

    //char
    var aphabetical: Char = 'C';
    println("C is a character : ${aphabetical} is Char");

    //string
    var name: String = "matheus with";
    println("My name is $name");

   //array
    var arr: Array<String> = arrayOf("My", "Name", "Is", "With");
    for (i in arr) {
        println(i);
    }



}
