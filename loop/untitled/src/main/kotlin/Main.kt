package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var num = 1;

    while (num <= 10) {
        println(num);
        num++;
    };


    var names = arrayOf("Praveen", "Gaurav", "Akash", "Sidhant", "Abhi", "Mayank");
    var index = 0;

    while (index < names.size) {
        println(names[index]);
        index++;
    };

    // while do loop
    var n: Int = 6;
    var fac: Int = 1;
    do {
        fac *= n;
        n--;
    } while (n > 0);
    println("Factorial of 6 is $fac");

    var number: Int = 2;
    var i: Int = 1;
    do {
        println("$number * $i = " + number * i);
        i++;
    } while (i <= 10);

    //foreach
    for (i in 1..6) {
        println("$i");
    };

    for (i in 1..6 step 2) {
        println("$i");
    };

    for (i in 5..1) {
        print("$i ")
    };
    println("It prints nothing")
    for (i in 5 downTo 1) {
        print("$i ")
    };
    for (i in 10 downTo 1 step 3) {
        print("$i ")
    };

    var numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    for (num in numbers) {
        if (num % 2 == 0) {
            print("$num ");
        };
    };

    var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")

    for (i in planets.indices) {
        println(planets[i])
    };

    for ((index, value) in planets.withIndex()) {
        println("Element at $index th index is $value")
    };

    var name = "Geeks";
    var name2 = "forGeeks";
    // traversing string without using index property}
    for (alphabet in name) print("$alphabet ");

    // traversing string with using index property
    for (i in name2.indices) print(name2[i] + " ");
    // traversing string using withIndex() library function
    for ((index, value) in name.withIndex()) println("Element at $index th index is $value");
    var collection = listOf(1, 2, 3, "listOf", "mapOf", "setOf");
    for (e in collection) {
        println(e);
    }


}

