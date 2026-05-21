# Java Object Class – Theory Notes

# Introduction

In Java, every class automatically inherits from the `Object` class.

Package:

```java
java.lang.Object
```

It is the root parent class of all Java classes.

Example:

```java
class Student {
}
```

Internally Java treats it as:

```java
class Student extends Object {
}
```

---

# Purpose of Object Class

The Object class provides common behavior to all Java objects.

It provides methods for:

- Object comparison
- String representation
- Hashing
- Runtime information
- Cloning
- Thread communication
- Garbage collection support

---

# Methods of Object Class

| Method | Purpose |
|---|---|
| `toString()` | Converts object into readable string |
| `equals(Object obj)` | Compares two objects |
| `hashCode()` | Returns hash value of object |
| `getClass()` | Returns runtime class information |
| `clone()` | Creates copy of object |
| `finalize()` | Called before garbage collection |
| `wait()` | Makes thread wait |
| `notify()` | Wakes one waiting thread |
| `notifyAll()` | Wakes all waiting threads |

---

# 1. toString()

## Purpose

Converts object into readable string format.

## Real Usage

- Printing objects
- Debugging
- Logging

---

# 2. equals(Object obj)

## Purpose

Compares two objects.

## Real Usage

- Object comparison
- Searching data
- Collection operations

---

# 3. hashCode()

## Purpose

Returns integer hash value of object.

## Real Usage

- HashMap
- HashSet
- Hashing algorithms

---

# 4. getClass()

## Purpose

Returns runtime class information.

## Real Usage

- Reflection
- Frameworks
- Runtime inspection

---

# 5. clone()

## Purpose

Creates copy of object.

## Real Usage

- Duplicate object creation
- Copying data

---

# 6. finalize()

## Purpose

Called before garbage collection.

## Note

Deprecated in modern Java.

---

# 7. wait()

## Purpose

Makes current thread wait.

## Real Usage

Multithreading.

---

# 8. notify()

## Purpose

Wakes one waiting thread.

## Real Usage

Thread communication.

---

# 9. notifyAll()

## Purpose

Wakes all waiting threads.

## Real Usage

Multiple thread synchronization.

---

# Most Important Methods in Real Projects

| Method | Usage Frequency |
|---|---|
| `toString()` | Very High |
| `equals()` | Very High |
| `hashCode()` | Very High |
| `getClass()` | Medium |
| `clone()` | Low |

---

# Key Interview Point

The Object class is important because:

- Every Java class inherits from it
- It provides common methods to all objects
- Supports polymorphism
- Enables object comparison and runtime operations

Example:

```java
Object obj = new Student();
```

A parent reference can hold child objects.

---

# Simple Real-Life Analogy

Think of Object class as:

```text
Human
```

All Java classes are like:

```text
Student
Teacher
Doctor
Engineer
```

Every human has common behavior.
Similarly every Java object gets common methods from Object class.

