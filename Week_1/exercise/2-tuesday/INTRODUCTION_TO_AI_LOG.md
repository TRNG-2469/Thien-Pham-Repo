# AI Prompt Log - Introduction to AI Coding Assistants

**Course:** Week 1 - Tuesday  
**Topic:** Introduction to AI Coding Assistants  
**Exercise:** Critiquing an AI-Generated `parseNumbers()` Method

---

# 1. Exercise Overview

## Objective

Learn how to work with AI coding assistants as a software engineer by reviewing, validating, and improving AI-generated code instead of blindly accepting suggestions.

---

# 2. Initial Prompt

## Context

Create a Java utility method that accepts a comma-separated string of numbers, converts each value into an integer, and returns an integer array.

### Example

| Input | Expected Output |
|--------|-----------------|
| `"10,20,30"` | `[10, 20, 30]` |
| `"10, 20 ,30"` | `[10, 20, 30]` |

---

## Prompt

> Write a Java method to split a string by comma, convert each item to an integer, and return the array of numbers.

---

# 3. AI Generated Solution

```java
public static int[] parseNumbers(String input) {
    String[] parts = input.split(",");
    int[] nums = new int[parts.length];

    for (int i = 0; i < parts.length; i++) {
        nums[i] = Integer.parseInt(parts[i]);
    }

    return nums;
}
```

---

# 4. Human Review (Human-in-the-Loop)

Instead of accepting the suggestion immediately, I reviewed every line of code.

## READ

### Method Declaration

```java
public static int[] parseNumbers(String input)
```

- Returns an integer array.
- Accepts a String parameter.

---

### Splitting the String

```java
String[] parts = input.split(",");
```

- Splits the input string using commas.
- Stores each value as a String.

Example:

```
10,20,30
```

becomes

```
parts[0] = "10"
parts[1] = "20"
parts[2] = "30"
```

---

### Parsing Numbers

```java
Integer.parseInt(parts[i]);
```

Converts each String into an integer.

---

# UNDERSTAND

The AI assumes that:

- The input is never null.
- Every value is a valid integer.
- No whitespace exists.
- The input string is never empty.

These assumptions are unsafe for production software.

---

# TEST

## Test Cases

| Input | Expected | Actual | Result |
|------|----------|--------|--------|
| `"10,20,30"` | `[10,20,30]` | `[10,20,30]` | ✅ |
| `null` | `[]` | NullPointerException | ❌ |
| `""` | `[]` | NumberFormatException | ❌ |
| `"10, 20 ,30"` | `[10,20,30]` | Parsing may fail | ❌ |
| `"10, two, 30"` | `[10,30]` | NumberFormatException | ❌ |

---

# 5. Problems Identified

## Problem 1 — Null Input

```java
input.split(",")
```

Calling this on a null reference throws

```
NullPointerException
```

---

## Problem 2 — Empty String

Input

```
""
```

produces

```
parts[0] = ""
```

Calling

```java
Integer.parseInt("")
```

throws

```
NumberFormatException
```

---

## Problem 3 — Invalid Numbers

Input

```
10, two, 30
```

causes

```java
Integer.parseInt(" two")
```

to throw

```
NumberFormatException
```

The program stops instead of continuing.

---

## Problem 4 — Whitespace

Input

```
10, 20 ,30
```

contains spaces around numbers.

Whitespace should be removed before parsing.

---

# 6. Refined Prompt

> The `parseNumbers` method has several issues:
>
> 1. It crashes when the input is null.
> 2. It crashes when the input is empty.
> 3. It crashes when invalid text exists.
> 4. It should ignore surrounding whitespace.
>
> Please update the method so it:
>
> - returns an empty array for null or blank input,
> - trims whitespace around each number,
> - catches parsing exceptions instead of crashing,
> - skips invalid values,
> - returns only successfully parsed integers.

---

# 7. AI Revised Solution Summary

The revised implementation improved the method by:

- Adding null validation.
- Returning an empty array for blank input.
- Trimming whitespace using `strip()`.
- Using `try-catch` to handle invalid numbers.
- Skipping invalid entries.
- Returning only valid integers.

---

# 8. Final Validation

## Verification Results

| Test Case | Expected | Result |
|-----------|----------|--------|
| `"10,20,30"` | `[10,20,30]` | ✅ |
| `"10, 20 ,30"` | `[10,20,30]` | ✅ |
| `"10, invalid, 30"` | `[10,30]` | ✅ |
| `""` | `[]` | ✅ |
| `null` | `[]` | ✅ |

---

# 9. AI Coding Assistant Evaluation

## What AI Did Well

- Generated a working solution quickly.
- Used appropriate Java syntax.
- Correctly split the string.
- Correctly converted Strings into integers.

---

## What AI Missed

- Null safety.
- Empty input validation.
- Invalid number handling.
- Whitespace cleanup.
- Defensive programming.

---

# 10. Lessons Learned

## AI Strengths

AI is effective for:

- Boilerplate code
- Syntax reminders
- Documentation
- Standard programming patterns

---

## AI Limitations

AI may fail with:

- Business logic
- Edge cases
- System design
- Runtime validation
- Security concerns

---

# 11. Human-in-the-Loop Reflection

This exercise demonstrated that AI-generated code should never be accepted without review. Although the initial implementation was syntactically correct, it failed to handle several real-world scenarios such as null inputs, empty strings, whitespace, and invalid values.

As the developer, I remain responsible for every line of code that is committed. My role is to review the AI's suggestions, understand the implementation, identify potential risks, refine the prompt when necessary, and thoroughly test the final solution before considering it production-ready.

---

# Key Takeaways

- AI predicts code based on probability, not understanding.
- Always follow the Human-in-the-Loop mindset.
- Never accept AI code without:
    - Reading it.
    - Understanding it.
    - Testing it.
- Use iterative prompting to improve AI-generated solutions instead of replacing them entirely.