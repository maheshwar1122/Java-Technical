# Necessity of Wrapper Classes in Java

## Introduction
Wrapper classes in Java are used to convert primitive data types into objects. Each primitive data type has a corresponding wrapper class available in the `java.lang` package.

---

# Primitive Types and Wrapper Classes

| Primitive Type | Wrapper Class |
|----------------|---------------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

---

# Why Wrapper Classes Are Necessary

## 1. Collections Framework Works with Objects
Java collections like `ArrayList`, `HashMap`, and `LinkedList` can store only objects, not primitive data types.

### Example
```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
```

---

## 2. Useful Utility Methods
Wrapper classes provide many built-in methods.

### Examples
```java
Integer.parseInt("100");
Integer.valueOf(50);
Double.parseDouble("12.5");
```

---

## 3. Supports Autoboxing and Unboxing
### Autoboxing
Converting primitive data type into object automatically.

```java
int num = 10;
Integer obj = num;
```

### Unboxing
Converting object back into primitive automatically.

```java
Integer obj = 20;
int value = obj;
```

---

## 4. Required in Generics
Generics in Java work only with objects.

### Example
```java
List<Integer> list = new ArrayList<>();
```

---

## 5. Data Conversion
Wrapper classes help convert data between different formats.

### Example
```java
String value = "200";
int number = Integer.parseInt(value);
```

---

## 6. Used in Java APIs
Many Java APIs require objects instead of primitive types.

---

# Complete Java Example

```java
public class WrapperExample {
    public static void main(String[] args) {

        // Primitive variable
        int number = 100;

        // Autoboxing
        Integer obj = number;

        // Unboxing
        int value = obj;

        System.out.println("Primitive value: " + number);
        System.out.println("Wrapper object: " + obj);
        System.out.println("Unboxed value: " + value);
    }
}
```

---

# Output

```text
Primitive value: 100
Wrapper object: 100
Unboxed value: 100
```

---

# Conclusion
Wrapper classes are necessary in Java because they allow primitive data types to behave like objects. They are widely used in collections, generics, APIs, and enterprise applications. Wrapper classes also provide utility methods and support automatic conversion through autoboxing and unboxing.

