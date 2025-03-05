// Access built-in Java classes
var String = Java.type("java.lang.String");
var Math = Java.type("java.lang.Math");
var Date = Java.type("java.util.Date");

// Example 1: Using Java String class
var javaString = new String("Hello, GraalVM!");
print(javaString.toUpperCase());  // Convert the string to uppercase

// Example 2: Using Java Math class
var randomValue = Math.random();  // Generate a random number between 0 and 1
print("Random Value: " + randomValue);

// Example 3: Using Java Date class
var currentDate = new Date();
print("Current Date and Time: " + currentDate.toString());

"OK";
