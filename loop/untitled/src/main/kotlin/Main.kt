package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var num = 1;

    while(num<= 10) {
        println(num);
        num++;
    };


    var names = arrayOf("Praveen","Gaurav","Akash","Sidhant","Abhi","Mayank");
    var index = 0;

    while (index < names.size) {
        println(names[index]);
        index++;
    };

}