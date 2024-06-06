# Simple tasks on data structures and algyrtms

This project contains 3 Classes with main method to execute
* Task1
* Task2
* Task3

And two .txt files with about 1.6-3.3 million lines of randomly generated numbers from range between 1-1000000001
you can use to test all Task classes



## Task1
The input is a long list of integers. Please write a small app that will output the list of distinct elements sorted in ascending order, plus the basic measurement information that contains the number of elements in the source, number of distinct elements, min and max value.

example:

* for the input - 1 10 20 20 2 5

expected output is:

* 1 2 5 10 20
* count: 6
* distinct: 5
* min: 1
* max: 20

To implement this, a TreeSet was used, which already has built-in methods to handle the sorting and insertion order.


## Task 2
Provide a working code that will find all the pairs (in this integer list) 
that sum up to 13 - `In this case to 500000` To test throughput. 
Each pair in the output should have first number not greater than the second one and lines should be sorted in an ascending order.

example:

* For the input - 1 2 10 7 5 3 6 6 13 0

expected output is:

* 0 13
* 3 10
* 6 7
* 6 7

To store matches, `HashMap` is used to ensures that duplicates are managed


## Task3
The first line of input contains a positive number n, next n lines contains pairs of positive integers, where each pair identifies a connection between two vertices in a graph. Please provide a working code that will give us the answer for the following questions: how many separated graphs are in the input.

example:

* For the input: 
* 3
* 4 3
* 1 4
* 5 6

expected output is:

* 2

In this Task, no example data is provided.
Application use `Scanner` to read first line `n` and following pairs of connections.