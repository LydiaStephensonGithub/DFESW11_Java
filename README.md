# DFESW11_Java
Coursework for the Java section of the DfE Software Specialism course from QA
## Hello World
1. Output "Hello World!" to the console.
2. Store "Hello World!" in a variable and then output it to the console.
3. Create a method that takes a String as a parameter, and then outputs it to the console.
4. Modify your method to return a String once called, which you then use to output to the console.
## Calculator
1. Create a method that accepts two integers as input, then returns an integer that is the sum of these two parameters. (Addition)
2. Create the following additional three methods that each take two parameters:
    - Multiplication - which takes two numbers and returns the product.
    - Subtraction - which takes two numbers, then returns the result of the subtraction.
    - Division - which takes two numbers, then returns the result of the division.
3. Your division method may have returned the wrong result; This is called a rounding error and is quite common in most languages. this is because we were using ints rather than doubles. Modify the division method so that it takes Double parameters and then return a Double, if not already.
## Results
1. A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. When all the exam marks have been added together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.
2. Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage. This class should also have 2 methods:
    - Method 1 - displays the results that the person got for each exam and then the total mark. Try to make the output neat and bespoke for each exam.
    - Method 2 - which finds and displays the percentage that the person received for the exams overall.
## Results Revisited
1. Expand the Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.
2. Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.
3. Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed.
## Flowcharts
1. Create a method which accepts 3 parameters, 2 integers and a boolean. If the boolean is true, the method will return a sum of the two numbers, and it if is false it will return the multiplication of the two numbers.
2. Recreate the following flowchart as a project. Ensure that your logic and outputs match that of the flowchart.
![flowchart1](https://user-images.githubusercontent.com/97948260/156814413-137736e0-5d2b-4af7-8576-1df620617789.png)
## Unique Sum
Given 3 integer values, return their sum. If one value is the same as another value, they do not count towards the sum. In other words, only return the sum of unique numbers given.
## Taxes
1. Create the tax class, it contains 2 methods.
    - Method 1 - which takes a salary and works out the percentage by which the salary will be taxed.
    - Method 2 - which works out the exact amount that the user will be taxed using a similar process to that in the first method. That amount should be returned and output to the console.
2. The salaries are taxed as below:
    - 0 - 14,999 : 0% tax
    - 15,000 - 19,999 : 10% tax
    - 20,000 - 29,999 : 15% tax
    - 30,000 - 44,999 : 20% tax
    - 45,000+ : 25% tax
3. Finally combine the 2 methods so that the second method utilizes the first method to return the correct result.
## Blackjack
Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. If they both go over 21 then return 0.
## Flowcharts Revisited
1. Recreate the following flowchart as a project.
![flowchart2](https://user-images.githubusercontent.com/97948260/156820672-c35a63f4-6033-4208-8f9d-d97f14226b4c.png)
2. Recreate the following flowchart as a project
![flowchart3](https://user-images.githubusercontent.com/97948260/156820718-af6ae4d7-c5b5-4b92-b80e-93ad0d55720f.png)
## Numbers
1. Create a method that can print out the numbers 1-10 10 times each.
2. Create a method to print the numbers 1 to 10 as many times as the value of that number.
3. Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
4. Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
5. Use a for()-loop to print the numbers 1-100 in words.
## Coins
Given a cost and an amount, work out the change given in specific coinage.
## Enhanced For Loops
1. Create an array of strings and iterate through it, printing each value to console, using an enhanced for loop.
2. Create an array of integers 1-20 and iterate through it, using an enhanced for loop, square, and then print each value.
3. Create a method that returns a boolean and accepts an integer as a parameter, if the integer is even, return true, if not then return false.
4. Using the array of integers from exercise 2 and the method created in exercise 3; iterate through the array using an enhanced for loop, calling the method from exercise 3 in the body.
    - If the value is even, cube it, then print it to console.
    - If the value is odd, square it, then print it to console
## String Manipulation
For this task you are to implement 4 methods that manipulate String objects. For all parts of this section you are only allowed to use the length(), substring(), and equals() methods. Avoid using arrays or any methods you have yet to be taught as this defeats the purpose of the exercise:
- Method 1 - When given a String, count and return how many words there are in that String.
- Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
- Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
- Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. A boolean value should be returned to indicate whether or not the second String has been found in the message.
## Calculator with Scanner
Create a method to ask the user which of the four methods they wish to use, then take the numbers as user input for the operation and output the result back to the user.
## Streams
1. Given the following List of names, using a stream, have it print "Hello " in front of each name besides "James".
2. Given the following List of Integers, using a stream, have it reduce and print the product (all numbers multiplied together).
3. Starting with a list of numbers, use streams to do the following:
    - Find the max value.
    - Find the min value.
    - Remove the odd numbers.
    - Remove the even numbers.
    - Find the sum of the list.
    - Square every number in the list then remove the even numbers and then find the min value.

