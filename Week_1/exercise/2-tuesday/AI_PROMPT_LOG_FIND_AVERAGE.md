# AI Prompt Log - Average Calculator

**Course:** Week 1 - Tuesday  
**Topic:** AI Prompt Engineering & Human-in-the-Loop Validation  
**Exercise:** Critiquing an AI-Generated `findAverage()` Method

---

# 1. Exercise Overview

## Objective

Create a Java utility method that calculates the average of an integer array and returns the result as a `double`.

### Example

| Input | Expected Output |
|--------|-----------------|
| `{5, 6}` | `5.5` |
| `{10, 20, 30}` | `20.0` |

---

# 2. Initial Prompt

> Write a static Java method named `findAverage` that takes an `int[]` array and returns the average as a `double`.

---

# 3. AI Generated Solution

```java
public static double findAverage(int[] arr) {
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }

    return sum / arr.length;
}
```

---

# 4. RUT Review (Navigator)

## READ

### Method Declaration

```java
public static double findAverage(int[] arr)
```

- Static utility method.
- Accepts an integer array.
- Returns a double.

---

### Variable Declaration

```java
int sum = 0;
```

Creates an accumulator variable used to calculate the total.

---

### Loop

```java
for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}
```

Loops through every element in the array and adds it to `sum`.

---

### Return Statement

```java
return sum / arr.length;
```

Divides the total by the number of elements.

---

# UNDERSTAND

The AI solution assumes:

- The array is never null.
- The array always contains at least one element.
- Integer division is acceptable.
- Integer overflow will never occur.

These assumptions are unsafe for production software.

---

# TEST

| Test Case | Expected | Actual | Result |
|-----------|----------|--------|--------|
| `{5,6}` | `5.5` | `5.0` | ❌ |
| `{10,20,30}` | `20.0` | `20.0` | ✅ |
| `null` | `0.0` | NullPointerException | ❌ |
| `{}` | `0.0` | ArithmeticException | ❌ |
| Large integer array | Correct average | Possible overflow | ⚠️ |

---

# 5. Problems Identified

## Problem 1 – Integer Division

```java
return sum / arr.length;
```

Both operands are integers.

Example:

```java
5 / 2
```

returns

```
2
```

instead of

```
2.5
```

The decimal portion is discarded before returning the value.

---

## Problem 2 – Null Input

```java
arr.length
```

If `arr` is null, Java throws

```
NullPointerException
```

before the loop begins.

---

## Problem 3 – Empty Array

Input

```java
new int[0]
```

causes

```java
sum / arr.length
```

to become

```java
0 / 0
```

which throws

```
ArithmeticException
```

---

## Problem 4 – Integer Overflow

Using

```java
int sum
```

may overflow when adding very large integer values.

Using

```java
long
```

is safer.

---

# 6. Refined Prompt

> The `findAverage` method has several issues:
>
> 1. It performs integer division, losing decimal precision.
> 2. It throws a `NullPointerException` when the input array is null.
> 3. It throws an `ArithmeticException` when the array is empty.
> 4. It should avoid integer overflow when calculating the sum.
>
> Please update the method so it:
>
> - returns `0.0` when the array is null or empty,
> - performs floating-point division,
> - uses `long` for the running sum,
> - safely returns the average as a `double`.

---

# 7. AI Revised Solution Summary

The revised implementation improved the method by:

- Adding null validation.
- Checking for empty arrays.
- Returning `0.0` instead of crashing.
- Using `long` to reduce overflow risk.
- Casting the sum to `double` before division.

---

# 8. Final Validation

| Test Case | Expected | Result |
|-----------|----------|--------|
| `{5,6}` | `5.5` | ✅ |
| `{10,20,30}` | `20.0` | ✅ |
| `{}` | `0.0` | ✅ |
| `null` | `0.0` | ✅ |

---

# 9. AI Evaluation

## What AI Did Well

- Generated the method quickly.
- Used a loop correctly.
- Correctly accumulated the total.

---

## What AI Missed

- Integer division.
- Null checking.
- Empty array handling.
- Integer overflow.

---

# 10. Lessons Learned

## Human-in-the-Loop

AI generated code that compiled successfully but contained several runtime and logical issues.

As the developer, I am responsible for reviewing every AI suggestion before accepting it.

---

## RUT Process

### READ

Read every line before accepting the code.

### UNDERSTAND

Understand every variable, loop, and return statement.

### TEST

Always test:

- Normal input
- Null input
- Empty arrays
- Boundary values
- Large inputs

---

# Reflection

This exercise demonstrated that compiling code is not necessarily correct code. The initial AI solution worked for some inputs but failed with null arrays, empty arrays, and integer division. By following the Read, Understand, Test (RUT) process and refining the prompt, I guided the AI toward a more reliable implementation. This reinforced the importance of defensive programming and validated the Human-in-the-Loop approach to AI-assisted software development.

---

# Key Takeaways

- AI predicts code—it does not verify correctness.
- Never accept AI-generated code without review.
- Test edge cases before committing code.
- Use iterative prompting to improve AI-generated solutions.
- The developer is responsible for every line of committed code.