# Spring-FrameworkCodes

Spring Framework – Major Modules

Spring traditionally has many modules, but the three core pillars developers focus on are:

IoC (Inversion of Control / Dependency Injection)

AOP (Aspect-Oriented Programming)

MVC (Model-View-Controller Web Framework)

IoC – Inversion of Control (Dependency Injection Container)

This is the backbone of Spring. It manages object creation, wiring dependencies, and lifecycle management—essentially helping developers avoid manual object management.

--> What IoC Container Does

Creates objects (beans)

Manages their lifecycle

Injects dependencies

Manages scopes (singleton, prototype…)

Two Core IoC Containers
1. BeanFactory (Interface)

Basic, lightweight container

Supports XML-based configuration

Loads beans lazily (only when needed)

Rarely used now

2. ApplicationContext (Interface)

Advanced container used in modern Spring apps

Supports:

XML config

Annotation config

Java-based config

Eager loading (loads all beans at startup)

Provides enterprise features:

Event handling

Internationalization

AOP integration
