# Spring Boot — Bean Scope & DI Demo (Dog + Trainer)

A tiny Spring Boot project that demonstrates **Inversion of Control (IoC)**, **Dependency Injection (DI)**, and the difference between **singleton** and **prototype** bean scopes. You’ll see how two `Dog` beans created from the Spring context are **different objects** when the bean is prototype-scoped, and how a `Trainer` dependency can be assigned/injected.

## What This Shows
- `Dog` is a Spring `@Component` with `@Scope("prototype")` → every `getBean(Dog.class)` returns a **new instance**.
- `Trainer` is a Spring `@Component` (default **singleton** unless you change it).
- A `Trainer` can be set on a `Dog` (manual assignment or DI).
- Printing the objects demonstrates object identity and state differences.

## Tech Stack
- Java **17**
- Spring Boot **3.5.x**
- Maven

## Why Prototype vs Singleton Matters

- **Singleton** (default): Spring creates **one** instance; every `getBean()` returns that same object.
- **Prototype**: Spring creates a **new** instance on each `getBean()` call (or injection point).

> If `Trainer` remains a singleton, both dogs share the same trainer.  
> For separate trainers per dog by default, annotate `Trainer` with `@Scope("prototype")` or create different trainers manually.

---

## Try It Yourself

- Remove `@Scope("prototype")` from `Dog` and re-run → both `Dog` objects will share state.
- Add a REST endpoint (add `spring-boot-starter-web`) to return dog info.
- Switch to **constructor injection** for `Dog(Trainer trainer)`.

---

## Requirements

- JDK **17+**
- Maven or the included **Maven Wrapper**

---

## License

MIT — see `LICENSE`.

