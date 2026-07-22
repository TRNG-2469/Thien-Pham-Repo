I used the same prompt for all 3 exercises and just change and updated the stack trace and code context as well as behaviors and expected behaviors.



Act as a senior Java software engineer and debugging expert.

## Goal

Help me identify the ROOT CAUSE of the bug, not just suppress the exception.

## Code Context

```java
Please use the RosterApp.java file for the code context
```

## Stack Trace

```text
Student: Alice

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.startsWith(String)" because "<local1>[<local2>]" is null
    at RosterApp.main(RosterApp.java:9)
```

## Expected Behavior

The program should print the students whose names start with a certain letter without crashing.

## Actual Behavior

The program prints "Student: Alice" and then crashes with a NullPointerException.

## Please Answer

1. What is the root cause?
2. Which line caused the exception?
3. Why did Java throw this exception?
4. Explain it like I'm a beginner learning Java.
5. Show the production-quality fix.
6. Should I use try-catch here? Why or why not?
7. Are there any other bugs or edge cases I should fix?



