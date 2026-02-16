
# Student Management System (Java)

This project is a **Student Management System** built in Java.
It helps manage **two types of students**:

* **UndergraduateStudent**
* **GraduateStudent**

Each student can be **part-time** or **full-time**, depending on specific rules.


## Undergraduate Students

Undergraduate students are classified using their **credit hours**:

* **12 or more credits** → Full-Time
* **Less than 12 credits** → Part-Time

```java
@Override
public String getStudentType() {
    return (creditHours >= 12) ? "Full-Time" : "Part-Time";
}
```

---

## Graduate Students

Graduate students are classified based on whether they are **research assistants**:

* Research Assistant → Full-Time Graduate Student
* Not a Research Assistant → Part-Time Graduate Student

```java
public String getStudentType() {
    return researchAssistant ? "Full-Time Graduate Student" : "Part-Time Graduate Student";
}
```

---

## Design Principles and Patterns Used

This system uses:

* **Inheritance**
* **Polymorphism**
* **Abstraction**
* **Builder Pattern**

These help keep the code:
Clean ,Easy to understand ,Easy to extend in the future

---

##  Single Responsibility Principle (SRP)

Each class has **only one main job**:

* **Student**
  Stores shared student details (ID, name, email, department).

* **UndergraduateStudent**
  Handles tuition calculation for undergraduate students.

* **GraduateStudent**
  Handles tuition calculation for graduate students.

* **Main**
  Creates student objects and displays their information.

This makes the code organized and easier to maintain.

---

##  Liskov Substitution Principle (LSP)

Both `UndergraduateStudent` and `GraduateStudent` **extend** the abstract `Student` class.

This means:

* You can use either student type anywhere a `Student` is expected.
* The program still works correctly.

In simple words:
Child classes can replace the parent class without breaking anything.

