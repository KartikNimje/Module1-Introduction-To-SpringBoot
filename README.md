Session 1

One of the core concepts in Spring is the Spring Bean — a Java object whose lifecycle is managed by the Spring IoC Container.

Spring provides multiple ways to register beans:

✅ @Component – Generic stereotype annotation for Spring-managed components.

✅ @Service – Specialized component for business logic layer.

✅ @Repository – Used for data access layer and exception translation.

✅ @Controller – Handles web requests in Spring MVC applications.

✅ @Configuration – Marks a class as a source of bean definitions.

✅ @Bean – Explicitly creates and registers a bean from a method inside a configuration class.


🔹 Bean Scopes in Spring

1️⃣ Singleton (Default)
- Single instance per Spring container.

2️⃣ Prototype
- New instance created every time the bean is requested.

3️⃣ Request
- One instance per HTTP request.

4️⃣ Session
- One instance per HTTP session.

5️⃣ Application
- One instance per ServletContext. 
Session 2

One of the core strengths of Spring Framework is Dependency Injection (DI), which helps create loosely coupled and maintainable applications.

✅ Ways to Inject Beans in Spring

🔹 Constructor Injection (@Autowired on constructor)
- Recommended approach
- Ensures mandatory dependencies are provided
- Easier for unit testing

🔹 Setter Injection (@Autowired on setter)
- Useful for optional dependencies
- Provides flexibility to modify dependencies later

🔹 Field Injection (@Autowired on fields)
- Simple and concise
- Commonly used but generally less preferred due to testing and maintainability concerns


⚡ Handling Multiple Bean Implementations

When Spring finds multiple beans of the same type, we can resolve the ambiguity using:

🔸 @Primary
- Marks a bean as the default choice for dependency injection.

🔸 @Qualifier
- Explicitly specifies which bean should be injected.

🔸 @ConditionalOnProperty
- Creates beans conditionally based on application properties.
- Extremely useful for environment-specific configurations and feature toggles.


