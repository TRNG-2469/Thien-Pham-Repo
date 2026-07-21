# AI Prompt Log - AI Pair Programming

**Course:** Week 1 - Tuesday  
**Topic:** AI Pair Programming (Driver/Navigator, RUT Process)  
**Exercise:** Utility Method - `getInitials()`

---

# 1. Initial Attempt

## Context
Create a Java utility method that extracts the initials from a person's full name.

### Examples

| Input | Expected Output |
|--------|-----------------|
| John Doe | JD |
| John Fitzgerald Kennedy | JFK |

---

## Prompt

> Write a Java method named `getInitials` that takes a `String name` and returns the user's initials.

---

## AI Generated Code

```java
public static String getInitials(String name) {
    String[] parts = name.split(" ");
    return "" + parts[0].charAt(0) + parts[1].charAt(0);
}
```

---

# 2. RUT Review (Navigator)

## READ

I reviewed the AI-generated code line by line.

### Line 1

```java
public static String getInitials(String name)
```

- Creates a static method.
- Accepts a String parameter.
- Returns a String.

---

### Line 2

```java
String[] parts = name.split(" ");
```

- Splits the input using spaces.
- Stores each word into an array.

Example:

```
John Doe
```

becomes

```
parts[0] = "John"
parts[1] = "Doe"
```

---

### Line 3

```java
return "" + parts[0].charAt(0) + parts[1].charAt(0);
```

- Gets the first character of the first name.
- Gets the first character of the second name.
- Combines both into a String.

---

# UNDERSTAND

The AI solution assumes:

- Input is never null.
- User always enters exactly two names.
- User only enters one space.
- There are no middle names.

These assumptions are unsafe for real-world applications.

---

# TEST

| Test Case | Expected | Actual | Result |
|-----------|----------|--------|--------|
| John Doe | JD | JD | ✅ Pass |
| Zendaya | Z | Crash | ❌ Fail |
| null | "" | NullPointerException | ❌ Fail |
| John  Doe | JD | Crash | ❌ Fail |
| John Fitzgerald Kennedy | JFK | JF | ❌ Incorrect |

---

# 3. Problems Identified

## Issue 1

### Null Input

Calling

```java
name.split(" ")
```

when `name` is null causes

```
NullPointerException
```

---

## Issue 2

### Single Name

If the input is

```
Zendaya
```

the array only contains one element.

Accessing

```java
parts[1]
```

causes

```
ArrayIndexOutOfBoundsException
```

---

## Issue 3

### Multiple Spaces

Input

```
John    Doe
```

creates empty array elements.

Calling

```java
charAt(0)
```

on an empty String causes an exception.

---

## Issue 4

### Multiple Names

Input

```
John Fitzgerald Kennedy
```

returns

```
JF
```

instead of

```
JFK
```

---

# 4. Refined Prompt

> The `getInitials` method has several problems:
>
> 1. It throws a `NullPointerException` if the input is null.
> 2. It crashes when the user enters only one name.
> 3. It fails when multiple spaces exist.
> 4. It ignores middle names.
>
> Please update the method so it:
>
> - returns an empty string for null or blank input,
> - trims unnecessary spaces,
> - splits on one or more whitespace characters,
> - loops through every name component,
> - returns all initials in uppercase.

---

# 5. AI Revised Solution

The AI updated the method by:

- Adding a null check.
- Handling blank input.
- Using `strip()`.
- Using `split("\\s+")`.
- Using a loop.
- Using `StringBuilder`.
- Converting initials to uppercase.

---

# 6. Final Validation

## Test Results

| Test Case | Expected | Result |
|-----------|----------|--------|
| John Doe | JD | ✅ |
| John Fitzgerald Kennedy | JFK | ✅ |
| Alice Smith | AS | ✅ |
| Zendaya | Z | ✅ |
| null | "" | ✅ |
| "" | "" | ✅ |
| "    " | "" | ✅ |

---

# 7. Lessons Learned

## Driver vs Navigator

AI acted as the **Driver** by generating the initial implementation.

I acted as the **Navigator** by:

- Reviewing the code.
- Finding edge cases.
- Identifying crashes.
- Refining the prompt.
- Testing the final implementation.

---

## RUT Process

### READ

Read every line before accepting AI output.

### UNDERSTAND

Understand why each statement exists.

### TEST

Always test:

- Null inputs
- Empty strings
- Single values
- Multiple values
- Boundary cases

---

# Reflection

This exercise showed that AI can generate working code quickly, but the first solution is often incomplete. As the Navigator, my responsibility is to review the logic, identify missing edge cases, improve the prompt through iteration, and verify the final implementation with testing before accepting the solution.