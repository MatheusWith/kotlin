package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // arithmatic operators
    var a: Int = 10 + 20;
    println(a);

    var x: Int = 10;
    var y: Int = 4;
    println("x + y = " + (x + y));
    println("x - y = " + (x - y));
    println("x * y = " + (x.times(y)));
    println("x / y = " + (x / y));
    println("x + y = " + (x.rem(y)));

    //relational operators
    var i: Int = 30;
    var j: Int = 40;
    println("i > j = "+(i>j))
    println("i < j = "+(i.compareTo(j) < 0))
    println("i >= j = "+(i>=j))
    println("i <= j = "+(i.compareTo(j) <= 0))
    println("i == j = "+(i==j))
    println("i != j = "+(!(i?.equals(j) ?: (j === null))))

    //Assigment operators
    var b: Int = 10;
    var c: Int = 5;
    b+=c;
    println(b)
    b-=c;
    println(b)
    b*=c
    println(b)
    b/=c;
    println(b)
    b%=c
    println(b)

    //Unary Operators
    var e: Int = 10;
    println("First print then increment: "+ e++);
    println("First increment then print: "+ ++e);
    println("First print then decrement: "+ e--);
    println("First decrement then print: "+ --e);

    //logical operators
    var one: Int = 100;
    var two: Int = 25;
    var three: Int = 10;
    var result: Boolean = false;
    if(one > two && one > three) {
        println(x)
    }
    if(one < two || one > three){
        println(y)
    }
    if(result.not()) {
        println("Logical operators")
    }
    //bitwise operators
    println("5 signed shift left by 1 bit: " + 5.shl(1))
    println("10 signed shift right by 2 bits: : " + 10.shr(2))
    println("12 unsigned shift right by 2 bits:  " + 12.ushr(2))
    println("36 bitwise and 22: " + 36.and(22))
    println("36 bitwise or 22: " + 36.or(22))
    println("36 bitwise xor 22: " + 36.xor(22))
    println("14 bitwise inverse is: " + 14.inv())
}