Act as a Principal Java Architect. Audit the following Java class. Provide a code review covering:
1.
Readability: Are comments clear? Are variables named consistently?
2.
Performance: Are there redundant memory allocations or nested O(N^2) loops?
3.
Exception Safety: Does it guard against nulls, division-by-zero, or bounds violations?
4.
Encapsulation: Is data properly hidden?
Provide constructive feedback points and a refactored version of the class resolving any vulnerabilities found.
Code:
Using the Employee.java file and the HRApp.java

AI Critique Points:

1. READABILITY & MAINTAINABILITY ⚠️ CRITICAL
2. EXCEPTION SAFETY ⚠️ CRITICAL
   Issue 2.1: Null Reference Vulnerability
   •
   setName() checks for null, but getEmployeeId() doesn't
   •
   HRApp attempts to set null name (line 7), which should throw exception, but inconsistent null handling elsewhere
   •
   Missing null check in constructor parameters (lines 9-12)
   Issue 2.2: No Division-by-Zero or Bounds Checking
   •
   Salary is negative-checked but missing lower/upper bounds
   •
   No validation for salary = 0 (edge case)
   •
   No maximum salary cap (could cause overflow issues in calculations)
   Issue 2.3: Incomplete Constructor Validationty
3. ENCAPSULATION VIOLATIONS ⚠️ MAJOR
      Issue 3.1: Setter Inconsistency
      •
      Only setMonthlySalary() and setName() have validation
      •
      No setter for employeeId (immutable intent unclear)
      •
      Inconsistent validation rules across setters
      Issue 3.2: State Mutation in Getters
      •
      Violates fundamental OOP contract: getters should never modify state
      •
      Breaks thread-safety assumptions
      •
      Violates Liskov Substitution Principle 

Implementation Decisions: 
I choose the suggestion because it covered both exceptio, null safety check, ecapsulation bound, validation, and error detailed messages.

Refactored Code Diff:
this.monthlySalary = validateSalary(salary);
private static final double MIN_SALARY = 0.0;
private static final double MAX_SALARY = 999_999.99;
