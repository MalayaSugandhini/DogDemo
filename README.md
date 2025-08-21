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
