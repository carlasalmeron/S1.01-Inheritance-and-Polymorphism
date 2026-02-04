# S1.01 - Inheritance-and-Polymorphism 

## 🎯Objetives
This project contains two exercises focused on core Object-Oriented Programming concepts in Java, including inheritance, polymorphism, and the use of static and final keywords.

## 📌Level 1
### ✅ Exercise 1: Musical instruments

A program designed to manage musical instruments in a music band. Three types of instruments are implemented:

- Wind instruments
- String instruments
- Percussion instruments

All instruments share common attributes such as name and price, and all implement a play() method with different behaviors using method overriding.

### ✅ Exercise 2 – Car Class

A Car class is created to understand memory behavior and initialization in Java.

Attributes:
- brand (static final) → class constant
- model (static) → shared among all instances
- power (final) → initialized in the constructor and immutable

A Main class is used to test static and non-static behavior.

## 📌Level 2
### ✅Exercise 1 – Smartphone with multiple functionalities

Create a Phone class with:

- Attributes: brand, model
- Method: call(number) → shows that you are calling

Create interfaces:

- Camera → takePhoto() method
- Clock → method setAlarm()

Create a Smartphone class that:
- Extends Phone
- Implements Camera and Clock
- Displays messages on the console when using each function

In main():
Instantiate a Smartphone.

Test:
- Make a call
- Take a photo
- Set an alarm

## 🛠 Technologies

- Java 25
- IntelliJ IDEA
- Git & GitHub 

## 🚀 Installation and Execution

### 📂Clone Repository

`git clone https://github.com/carlasalmeron/S1.01-Inheritance-and-Polymorphism.git`