# 🚀 Custom Annotation Validator in Java

This project demonstrates how to create and use **custom annotations** in Java for field-level validation using **reflection**. It provides a simple and powerful way to enforce constraints like "must start with" on class fields.

---

## 📌 Features

- ✅ Custom annotation: `@StartsWith`
- ✅ Field-level validation using Java Reflection
- ✅ Clean and extensible `Validator` utility
- ✅ Throws exceptions with custom messages when validation fails
- ✅ Good learning reference for annotation + reflection in Java

---

## 🧠 Concept

In Java, annotations can be used not just for documentation or frameworks, but also for creating **custom rules**. This project introduces an annotation `@StartsWith`, which can be applied to any `String` field to enforce that it starts with a specified prefix.

---

## 🏷️ Custom Annotation: `@StartsWith`

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface StartsWith {
    String value();              // The prefix value
    String message() default "Field must start with specified value";
}



# 💡 Future Enhancements
- Add more annotations like @NotNull, @Min, @Email

- Integrate with Spring Boot as a BeanPostProcessor

- Create a full validation framework
```
