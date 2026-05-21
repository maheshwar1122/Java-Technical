# Java Object Class – Coding Examples

# 1. toString() Example

```java
class Student {
    int id = 101;

    public String toString() {
        return "Student ID = " + id;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
    }
}
```

## Output

```text
Student ID = 101
```

---

# 2. equals() Example

```java
class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(1);

        System.out.println(s1.equals(s2));
    }
}
```

## Output

```text
true
```

---

# 3. hashCode() Example

```java
class Student {
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.hashCode());
    }
}
```

## Output Example

```text
366712642
```

---

# 4. getClass() Example

```java
class Student {
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.getClass());
    }
}
```

## Output

```text
class Student
```

---

# 5. clone() Example

```java
class Student implements Cloneable {
    int id = 10;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        Student s2 = (Student) s1.clone();

        System.out.println(s2.id);
    }
}
```

## Output

```text
10
```

---

# 6. wait() and notify() Example

```java
class Test extends Thread {

    public void run() {
        synchronized(this) {
            System.out.println("Thread is running");

            try {
                wait();
            } catch(Exception e) {
                System.out.println(e);
            }

            System.out.println("Thread resumed");
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Test t = new Test();
        t.start();

        Thread.sleep(2000);

        synchronized(t) {
            t.notify();
        }
    }
}
```

---

# 7. getClass() with Object Reference

```java
class Student {
}

public class Main {
    public static void main(String[] args) {

        Object obj = new Student();

        System.out.println(obj.getClass());
    }
}
```

## Output

```text
class Student
```

---

# 8. toString() Default Behavior

```java
class Student {
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.toString());
    }
}
```

## Output Example

```text
Student@1b6d3586
```

---

# VS Code Instructions

## Step 1
Install:

- Java JDK
- VS Code
- Extension Pack for Java

---

## Step 2
Create a file:

```text
Main.java
```

---

## Step 3
Paste any program into the file.

---

## Step 4
Click:

```text
Run ▶
```

or run in terminal:

```bash
javac Main.java
java Main
```

---

# GitHub Upload Instructions

## Step 1
Create a new repository in GitHub.

## Step 2
Upload:

- `.java` files
- README.md
- Notes documents

## Step 3
Add repository description:

```text
Java Object Class methods with examples and explanations for beginners.
```

---

# Recommended GitHub Repository Name

```text
java-object-class-guide
```

