package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun isOdd(x: Int) = x % 2 != 0;

fun isEven(x: Int) = x % 2 == 2;

// Return s True if company start with "GeeksforGeeks"
fun hasPrefix(company: Any):Boolean{
    return when (company) {
        is String -> company.startsWith("GeeksforGeeks")
        else -> false
    }
};

fun main() {
    print("Enter the name of heavenly body: ");
    var name = readLine()!!.toString();
    when(name) {
        "Sun" -> println("Sun is a Star");
        "Moon" -> println("Moon is a Satellite");
        "Earth" -> println("Earth is a planet");
        else -> println("I don't know anything about it");
    }
    var name2 = readLine()!!.toString();

    when(name2) {
        "Sun" -> println("Sun is a Star");
        "Moon" -> println("Moon is a Satellite");
        "Earth" -> println("Earth is a planet");
    }

    print("Enter number of the Month: ");
    var monthOfYear  = readLine()!!.toInt();

    var month = when(monthOfYear) {

        1->"January";
        2->"February";
        3->"March";
        4->"April";
        5->"May";
        6->"June";
        7->"July";
        8->"August";
        9->"September";
        10->"October";
        11->"November";
        12->"December";
        else-> "Not a month of year";
    }

    println(month);

    print("Enter name of the planet: ");
    var planet=readLine()!!.toString();

    when(planet) {
        "Mercury","Earth","Mars","Jupiter"
            ,"Neptune","Saturn","Venus","Uranus" -> println("This is a planet");
        else -> println("This not a planet");
    }

    print("Enter the month number of year: ");
    var n= readLine()!!.toInt();

    when(n) {
        in 1..3 -> print("Spring season");
        in 4..6 -> print("Summer season");
        in 7..8 -> print("Rainy season");
        in 9..10 -> print("Autumn season");
        in 11..12 -> print("Winter season");
        !in 1..12 -> print("Enter valid month of the year");
    }

    var gfg: Any = "GeeksforGeeks";

    when(gfg){

        is Int -> println("It is an Integer");
        is String -> println("It is a String");
        is Double -> println("It is a Double");
    }

    var x: Int = 8

    when{
        isOdd(x) ->println("Odd");
        isEven(x) -> println("Even");
        else -> println("Neither even nor odd");
    }

    var company = "GeeksforGeeks is a computer science portal"
    var result = hasPrefix(company)

    if(result) {

        println("Yes, string started with GeeksforGeeks")
    }
    else {

        println("No, String does not started with GeeksforGeeks")
    }
}