# Introduction to Programming - Exercise 2

This repository contains my homework for the second exercise. It is for the class **Introduction to Programming** (Prof. Dr. Pedro José Marrón) at the **University of Duisburg-Essen (UDE)**.

## 📝 About the Exercise

The homework (see `Paper02-Homework.pdf`) has two parts: theory and a coding task.

* **Part 1: Words and Rules:** Basic Java rules (how Java works on different systems, the Java Virtual Machine) and rules for naming variables.
* **Part 2: Classes:** Learning about object-oriented programming with a simple Pirate Game. It shows how to separate classes, variables, and methods.
* **Coding Task:** Writing a math algorithm to check coordinates.

## 💻 The Program: `PointChecker.java`

The Java program asks the user to type an x and a y number. Then, it checks if the point $(x, y)$ is on a specific line, on a specific circle, on both, or on neither.

**Math equations used:**
* Line: $y = 2x - 2$
* Circle: $x^{2} + y^{2} = 8$

### 🚀 How to Run the Code

To run the program on your computer, you need the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/).

1. Clone this repository to your computer and open the folder.
2. Compile the Java code in your terminal:
   ```bash
   javac PointChecker.java
   ```
3. Run the program:
   ```bash
   java PointChecker
   ```
4. Follow the text on the screen and type the numbers for x and y.